package com.example.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/api")
public class demoController {

    @GetMapping("/get")
    public String  myFunction(){
        System.out.println("Jai Jagannath");
        return "Jai Jagannath";
    }

}
