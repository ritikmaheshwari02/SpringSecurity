package com.hope.controller;

import com.hope.entities.User;
import com.hope.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;
    
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

//    @PostMapping("/login")
//    public User loginUser(@RequestBody User user) {
//        return userService.loginUser(user);
//    }
}
