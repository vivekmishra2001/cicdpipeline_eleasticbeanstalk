package com.example.cicdpipeline.cicdpipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("/first")
    public String hello(){
        return "Hello Vivek Mishra first Project";
    }

    @GetMapping("/bhisham")
    public String getTempraure(){

        return "This is temprature";
    }
}
