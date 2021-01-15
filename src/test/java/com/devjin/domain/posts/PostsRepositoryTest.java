package com.devjin.domain.posts;

import com.devjin.domain.Posts.Posts;
import com.devjin.domain.Posts.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;
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
//    @Test
//    public void 작성일수정일되는지(){
//        //given
//        postsRepository.save(Posts.builder()
//                .title("title")
//                .contents("content")
//                .author("김의진")
//                .build());
//        //when
//        List<Posts> dataList = postsRepository.findAll();
//        Posts firstObj  = dataList.get(0);
////        LocalDateTime now = LocalDateTime.of(2021,1,13,0,0,0);
////        System.out.println(now + "ㅇㄹㄴㅇㄹㄴㅇㄹㅇㄴㄹㄴㅇㄹ");
//        //then
//        assertThat(firstObj.getCreateDate()).isAfter(LocalDateTime.now());
//        assertThat(firstObj.getModifiedDate()).isAfter(LocalDateTime.now());
//    }
}
