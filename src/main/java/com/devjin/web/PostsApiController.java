package com.devjin.web;

import com.devjin.service.PostsService;
import com.devjin.web.dto.posts.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping(value = "/api/posts")
    public Long save(@RequestBody PostsSaveRequestDto postsSaveRequestDto){ // 데이터를 json 으로 넘겨줄땐 @RequestBody를 사용한다.
        return postsService.save(postsSaveRequestDto);
    }

    @DeleteMapping(value = "/api/posts/{id}")
    public void delete(@PathVariable Long id){
        postsService.delete(id);
    }
}
