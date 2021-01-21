package com.devjin.web.dto.posts;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateResponseDto {
    private String title;
    private String contents;
    private String author;

    public PostsUpdateResponseDto(String title, String contents, String author) {
        this.title = title;
        this.contents = contents;
        this.author = author;
    }
}
