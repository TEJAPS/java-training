package com.dpoint.tutorial.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/abcd")
    public String firstApi(){
        return "welcome to firstApi";
    }

    @GetMapping("showhealth")
    public String randomly(){
        return "Application is up";
    }

}

// APi:
//1. GET Api
//2. POST api
//3. Put api
//4. delete api
//5. options api