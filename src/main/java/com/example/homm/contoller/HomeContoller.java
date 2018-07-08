package com.example.homm.contoller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {
    @PostMapping("/")
    public String home(){
        return "hello,world";
    }
}
