package com.demo.demo.socialmediaapp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.demo.socialmediaapp.entity.User;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    static{
        users.add(new User(1,"Neema" ,LocalDate.now().minusYears(29)));
        users.add(new User(2,"Meet" ,LocalDate.now().minusYears(32)));
        users.add(new User(3,"Heeya" ,LocalDate.now().minusYears(4)));
    }
    public List<User> findAll(){
        return users;
    }
}
