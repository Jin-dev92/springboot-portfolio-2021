package com.devjin.web.dto.posts;

import com.devjin.domain.Posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostsListRequestDto {
    private String title;
    private String contents;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListRequestDto(Posts posts) {
        this.title = posts.getTitle();
        this.contents = posts.getContents();
        this.author = posts.getAuthor();
        this.modifiedDate = posts.getModifiedDate();
    }
}
