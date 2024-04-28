package com.springexample.instagram.service;

import com.springexample.instagram.model.Posts;
import com.springexample.instagram.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    PostRepo repo;

    public List<Posts> getAllPosts(){
        return repo.findAll();
    }

    public Optional<Posts> getPost(@PathVariable String id){
        return repo.findById(id);
    }

    public String createPost(@RequestBody Posts post){
        repo.save(post);
        return "Post Created Successfully";
    }
}
