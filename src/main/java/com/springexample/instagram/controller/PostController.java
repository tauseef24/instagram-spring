package com.springexample.instagram.controller;

import com.springexample.instagram.model.Posts;
import com.springexample.instagram.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class PostController {
    @Autowired
    PostService postService;

    @CrossOrigin
    @PostMapping("/createpost")
    public String createPost(@RequestBody Posts post){
        post.setLikes(0);
        return postService.createPost(post);
    }

    @CrossOrigin
    @GetMapping("/posts")
    public List<Posts> getAllPosts() {
        return postService.getAllPosts();
    }

    @CrossOrigin
    @GetMapping("posts/{id}")
    public Optional<Posts> getPost(@PathVariable String id) {
        return postService.getPost(id);
    }
}
