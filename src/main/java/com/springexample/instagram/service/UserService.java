package com.springexample.instagram.service;

import com.springexample.instagram.model.Users;
import com.springexample.instagram.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
    @Autowired
    UserRepo repo;

    public String register(@RequestBody Users users){
        repo.save(users);
        return "User Created Successfully";
    }
    public String login(@RequestBody Users usersBody) {
        String email = usersBody.getEmail();
        String password = usersBody.getPassword();

        if(email.equals("admin@gm.co") && password.equals("1234")) {
            return "Logged In Successfully";
        } else {
            return "Login Failed";
        }
    }
}
