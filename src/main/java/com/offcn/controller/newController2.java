package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class newController2 {

    @RequestMapping("/newController")
    public String getThymeleaf(){
        System.out.println("新的controller");

        return "index";
    }
}

