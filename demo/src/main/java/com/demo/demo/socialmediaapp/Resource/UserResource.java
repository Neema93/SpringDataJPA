package com.demo.demo.socialmediaapp.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.socialmediaapp.entity.User;
import com.demo.demo.socialmediaapp.service.UserDaoService;

@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;
    
    public UserResource(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/user")
    public List<User> retriveUser(){
        return service.findAll();
    }
}
