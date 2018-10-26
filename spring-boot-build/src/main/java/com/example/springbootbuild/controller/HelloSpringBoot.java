package com.example.springbootbuild.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class HelloSpringBoot {
    @RequestMapping("/boot")
    public String index(){
        return "Hello Spring Boot";
    }
}
