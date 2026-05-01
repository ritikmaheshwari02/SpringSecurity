package com.hope.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetController {
    
    @GetMapping("/hello") 
    public String greet() {
        return "Hello Buddy";
    }
}
