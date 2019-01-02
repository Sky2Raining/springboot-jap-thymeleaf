package com.skyraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skyraining.domain.User;
import com.skyraining.domain.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getUser")
    @Cacheable(value = "user-key")
    public User getUser() {
        User user = userRepository.findByUserName("aa");
        return user;
    }

    @RequestMapping("/getUsers")
    @Cacheable(value = "key-Users")
    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }
}