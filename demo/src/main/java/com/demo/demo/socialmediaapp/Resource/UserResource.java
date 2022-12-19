package com.demo.demo.socialmediaapp.Resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
    public List<User> retriveAllUser(){
        return service.findAll();
    }
    @GetMapping("/user/{id}")
    public User retriveUser(@PathVariable int id){
     
       User user = service.finduser(id);
       if(user == null){
        throw new UserNotFoundException("id:"+id);
       }
        return user;
    }
    @PostMapping("/user")
    public ResponseEntity<User> createeUser(@RequestBody User user){
      User savedUser=  service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
