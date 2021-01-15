package com.devjin.web;

import com.devjin.service.PostsService;
import com.devjin.web.dto.posts.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping(value = "/api/posts")
    public Long save(@RequestBody PostsSaveRequestDto postsSaveRequestDto){ // 데이터를 json 으로 넘겨줄땐 @RequestBody를 사용한다.
        System.out.println(postsSaveRequestDto + "  MediaType.APPLICATION_FORM_URLENCODED_VALUE");
        return postsService.save(postsSaveRequestDto);
    }

    @DeleteMapping(value = "/api/posts")
    public void delete(){
//        postsService.
    }
//    @PostMapping(value = "/api/posts", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public Long jsonTypeSave(@RequestBody PostsSaveRequestDto postsSaveRequestDto){ // 데이터를 json 으로 넘겨줄땐 @RequestBody를 사용한다.
//        System.out.println(postsSaveRequestDto + "consumes = MediaType.APPLICATION_JSON_VALUE");
//        return postsService.save(postsSaveRequestDto);
//    }
}
