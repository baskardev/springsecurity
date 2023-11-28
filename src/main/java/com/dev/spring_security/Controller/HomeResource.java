package com.dev.spring_security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeResource {

    @GetMapping("/")
    private String returnHome(){
        return "home";
    }

    @GetMapping("/admin")
    private String returnHomeAdmin(){
        return "home admin";
    }

    @GetMapping("/user")
    private String returnHomeUser(){
        return "home user";
    }
}
