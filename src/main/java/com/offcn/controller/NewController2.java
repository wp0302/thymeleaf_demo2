package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NewController2 {

    @RequestMapping("/newController")
    public String getThymeleaf(){
        System.out.println("新的controller");

        return "在GitHub上修改的还能运行吗？试试";
    }
}

