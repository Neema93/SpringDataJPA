package com.demo.demo.socialmediaapp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.demo.demo.socialmediaapp.entity.User;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    public static int usersCount = 0;
    static{
        users.add(new User(++usersCount,"Neema" ,LocalDate.now().minusYears(29)));
        users.add(new User(++usersCount,"Meet" ,LocalDate.now().minusYears(32)));
        users.add(new User(++usersCount,"Heeya" ,LocalDate.now().minusYears(4)));
    }
    public List<User> findAll(){
        return users;
    }
    public User finduser(int id) {
        Predicate<? super User> Predicate = user -> user.getId().equals(id);
        return users.stream().filter(Predicate).findFirst().orElse(null);
        
    }
    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
}
