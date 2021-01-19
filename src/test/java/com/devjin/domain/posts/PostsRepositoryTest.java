package com.devjin.domain.posts;

import com.devjin.domain.Posts.Posts;
import com.devjin.domain.Posts.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;
    @Autowired
    private TestRestTemplate testRestTemplate;

    @After
    public void destoryAll(){
        postsRepository.deleteAll();
    }

    @Test
    @DisplayName("게시물이 잘 작성 되는지?")
    public void 게시물작성이잘되는지(){
        String title = "제제제제제모고곡";
        String contents = "sodyd";
//        //given
        postsRepository.save(
                Posts.builder()
                .title(title)
                .contents(contents)
                .author("김의진")
                .build());
//
//        //when
        List<Posts> dataList = postsRepository.findAll();

        //then
        Posts posts = dataList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContents()).isEqualTo(contents);
    }
    @Test
    public void 작성일수정일되는지(){
        //given
        postsRepository.save(Posts.builder()
                .title("title")
                .contents("content")
                .author("김의진")
                .build());
        //when
        List<Posts> dataList = postsRepository.findAll();
        Posts firstObj  = dataList.get(0);
        //then
        assertThat(firstObj.getCreateDate()).isAfter(LocalDateTime.now());
        assertThat(firstObj.getModifiedDate()).isAfter(LocalDateTime.now());
    }

    @Test
    public void 어드민페이지리스트확인(){
        //given 더미 데이터 입력
        postsRepository.save(Posts.builder()
                .title("제제제제제제제목")
                .contents("내용내냉내용")
                .author("김의진")
                .build());
        //when 비교할 데이터 가공
        String body = testRestTemplate.getForObject("/api/admin",String.class);
        //then 리스트가 예상했던 것과 같게 나와야함
        assertThat(body).contains("김의진");
    }

}
