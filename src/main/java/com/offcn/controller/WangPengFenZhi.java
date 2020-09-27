package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WangPengFenZhi {

    @RequestMapping("/fenzhi")
    public String fenzhi(){
        System.out.println("fenzhi");
        return "分支";
    }
}
