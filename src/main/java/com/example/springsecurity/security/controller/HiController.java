package com.example.springsecurity.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    
    @GetMapping("/hi")
    public String sayHi(){
        return "Login Successfully";
    }


    @GetMapping("/hello")
    public String sayHello(){
        return "Say hello";
    }
}
