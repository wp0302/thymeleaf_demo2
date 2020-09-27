package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleaf1")
    public String getThymeleaf(Model model){
        model.addAttribute("username","李四");

        return "index";
    }

    @RequestMapping("/thymeleaf2")
    public String getThymeleaf2(Model model){
        User user = new User(1,"hhh",6);
        model.addAttribute("user",user);

        return "index2";
    }

    @RequestMapping("/thymeleaf3")
    public String getThymeleaf3(Model model){
        Map map = new HashMap();
        map.put("id",111111);
        map.put("name","王五");
        map.put("age",18);
        model.addAttribute("map",map);

        return "index3";
    }

    @RequestMapping("/thymeleaf4")
    public String getThymeleaf4(Model model){
        List list = new ArrayList();
        list.add(new User(1,"赵六",111));
        list.add(new User(2,"田七",222));
        model.addAttribute("list",list);
        return "index4";
    }

    @RequestMapping("/thymeleaf5")
    public String getThymeleaf5(Model model){
        model.addAttribute("username","小兰");
        model.addAttribute("href","http://www.baidu.com");
        return "index5";
    }

    @RequestMapping("/thymeleaf6")
    public String thymeleaf6(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("users","admin");
        model.addAttribute("manager","manager");
        return "index6";
    }
}
