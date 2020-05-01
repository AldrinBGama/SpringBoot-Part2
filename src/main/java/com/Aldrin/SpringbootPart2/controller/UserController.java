package com.Aldrin.SpringbootPart2.controller;

import com.Aldrin.SpringbootPart2.model.User;
import com.Aldrin.SpringbootPart2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/home")
    public String message(){
        return "Welcome to Spring Cache and Security";
    }

    @Autowired
    UserService userService;

    @GetMapping("/users/{id}")
    public User findUserById(@PathVariable long id)
    {
        System.out.println("Searching by ID  : " + id);
        return userService.getUser(id);
    }
}
