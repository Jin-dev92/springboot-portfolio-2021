package com.devjin.web.dto.posts;

import com.devjin.domain.Posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String contents;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String contents, String author) {
        this.title = title;
        this.contents = contents;
        this.author = author;
    }

    public Posts toEntity(){ // jpa 함수 사용 시 Posts로 변환해야함.
        return Posts.builder()
                .title(title)
                .contents(contents)
                .author(author)
                .build();
    }
}
