package com.example.studentaphttps.start.spring.io.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {
    @GetMapping("/")
    public String HomePage() {
        return "Welcome to my home page";
    }


    }

