package com.microservicioslitethinking.app.controller;

import com.microservicioslitethinking.app.entity.User;
import com.microservicioslitethinking.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/create")

public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    @PostMapping("/user/create")
    public void  createUser(@RequestBody User user) {userService.createUser(user);}


    @PutMapping("/user/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId, @RequestBody User user)
    {
        //userService.updateUser(user,userId);
        user.setId(userId);
        User updatedUser = userService.updateUser(userId , user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }





}

