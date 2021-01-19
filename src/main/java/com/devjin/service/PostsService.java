package com.devjin.service;

import com.devjin.domain.Posts.Posts;
import com.devjin.domain.Posts.PostsRepository;
import com.devjin.web.dto.posts.PostsListRequestDto;
import com.devjin.web.dto.posts.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto postsSaveRequestDto){
        // pk를 리턴해줌
        return postsRepository.save(postsSaveRequestDto.toEntity()).getNo();
    }
    @Transactional
    public void delete(Long id){
        postsRepository.deleteById(id);
    }
//    public Long update(){
//
//    }
    @Transactional(readOnly = true)
    public List<PostsListRequestDto> postsList(){
        return postsRepository.postsFindAll().stream().map(PostsListRequestDto::new).collect(Collectors.toList());
    }
}
