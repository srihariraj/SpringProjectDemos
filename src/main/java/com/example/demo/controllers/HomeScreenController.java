package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeScreenController {

    @GetMapping("/greetings")
    public String getGreetings() {
        return"Hello";
       
    }
}