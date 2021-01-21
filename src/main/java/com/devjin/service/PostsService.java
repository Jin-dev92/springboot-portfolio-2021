package com.devjin.service;

import com.devjin.domain.Posts.Posts;
import com.devjin.domain.Posts.PostsRepository;
import com.devjin.web.dto.posts.PostsListRequestDto;
import com.devjin.web.dto.posts.PostsSaveRequestDto;
import com.devjin.web.dto.posts.PostsUpdateRequestDto;
import com.devjin.web.dto.posts.PostsUpdateResponseDto;
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
    public void deleteById(Long id){
        postsRepository.deleteById(id);
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 id 가 없습니다. id = "+ id));
        posts.update(requestDto.getTitle(), requestDto.getContents(),requestDto.getAuthor());
        return id;
    }
    @Transactional(readOnly = true)
    public List<PostsUpdateResponseDto> findById(Long id){
        System.out.println();
        return null;
    }
    @Transactional(readOnly = true)
    public List<PostsListRequestDto> postsList(){
        return postsRepository.postsFindAll().stream().map(PostsListRequestDto::new).collect(Collectors.toList());
    }
}
