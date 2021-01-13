package com.devjin.service;

import com.devjin.domain.Posts.PostsRepository;
import com.devjin.web.dto.posts.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto postsSaveRequestDto){
        // pk를 리턴해줌
        return postsRepository.save(postsSaveRequestDto.toEntity()).getNo();
    }

//    public Long delete(){
//
//    }
//
//    public Long update(){
//
//    }
}
