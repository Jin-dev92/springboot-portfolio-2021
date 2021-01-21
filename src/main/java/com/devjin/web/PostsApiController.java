package com.devjin.web;

import com.devjin.service.PostsService;
import com.devjin.web.dto.posts.PostsSaveRequestDto;
import com.devjin.web.dto.posts.PostsUpdateRequestDto;
import com.devjin.web.dto.posts.PostsUpdateResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping(value = "/api/posts") // POST
    public void save(@RequestBody PostsSaveRequestDto postsSaveRequestDto){ // 데이터를 json 으로 넘겨줄땐 @RequestBody를 사용한다.
        postsService.save(postsSaveRequestDto);
    }

    @DeleteMapping(value = "/api/posts/{id}") // DELETE
    public void deleteById(@PathVariable Long id){
        postsService.deleteById(id);
    }

    // PUT
    @PutMapping(value = "/api/posts/{id}")
    public Long update(@PathVariable Long id , PostsUpdateRequestDto requestDto){ // @RequestBody 는 post 에서만 사요해야함.
//        return postsService.update(id , requestDto);
        return null;
    }

    @GetMapping("/api/posts/{id}")
    public List<PostsUpdateResponseDto> updatePostResponse(@PathVariable Long id){ //수정 버튼 눌렀을 떄 input 에 내용 채우기
        System.out.println("updatePostResponse,    + " + "id : " + id);
        return postsService.findById(id);
    }


}
