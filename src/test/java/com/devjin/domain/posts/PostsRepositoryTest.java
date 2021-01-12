package com.devjin.domain.posts;

import com.devjin.domain.Posts.Posts;
import com.devjin.domain.Posts.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

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
    public void 게시물작성테스트(){
        String title = "제제제제제모고곡";
        String contents = "sodyd";
        //given

        postsRepository.save(
                Posts.builder()
                .title(title)
                .contents(contents)
                .regDate("2021-01-12")
                .author("김의진")
                .build());

        //when
        List<Posts> dataList = postsRepository.findAll();

        //then
        Posts posts = dataList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContents()).isEqualTo(contents);
    }
}
