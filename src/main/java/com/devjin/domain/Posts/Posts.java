package com.devjin.domain.Posts;

import com.devjin.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;
    @Column
    private String title;
    @Column
    private String contents;
    @Column
    private String author;


    @Builder
    public Posts(String title, String contents, String author) {
        this.title = title;
        this.contents = contents;
        this.author = author;
    }

    public void update(String title, String contents, String author){
        this.title = title;
        this.contents = contents;
        this.author = author;
    }
}
