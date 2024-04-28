package com.springexample.instagram.controller;

import com.springexample.instagram.model.Users;
import com.springexample.instagram.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping("/register")
    public String register(@RequestBody Users users){
        return userService.register(users);
    }

    @CrossOrigin
    @GetMapping("login")
    public String login(@RequestBody Users users){
        return userService.login(users);
    }
}
