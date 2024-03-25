package com.microservicioslitethinking.app.controller;

import com.microservicioslitethinking.app.entity.User;
import com.microservicioslitethinking.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/create")

public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    @PostMapping("/user/create")
    public void  createUser(@RequestBody User user) {userService.createUser(user);}


    @PostMapping("/user/update/{userId}")
    public void  updateUser(@RequestBody User user, Long userId) {userService.updateUser(user,userId);}



}

