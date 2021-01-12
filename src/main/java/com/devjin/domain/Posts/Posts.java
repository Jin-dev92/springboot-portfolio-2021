package com.devjin.domain.Posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;
    @Column
    private String title;
    @Column
    private String contents;
    @Column
    private String regDate;
    @Column
    private String author;


    @Builder
    public Posts(String title, String contents, String regDate, String author) {
        this.title = title;
        this.contents = contents;
        this.regDate = regDate;
        this.author = author;
    }
}
