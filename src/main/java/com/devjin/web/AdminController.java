package com.devjin.web;

import com.devjin.service.PostsService;
import com.devjin.web.dto.posts.PostsListRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class AdminController {
    private final PostsService postsService;

    @GetMapping("/api/admin") //GET
    public List<PostsListRequestDto> postsList(){
//        return model.addAttribute("posts",postsService.postsList());
        return postsService.postsList();
    }


}
