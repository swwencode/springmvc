package com.xxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jump")
public class MyAction005 {

    @RequestMapping("/one")
    public String one(){
        System.out.println("one................one");
        return "main";
    }

    @RequestMapping("/two")
    public String two(){
        System.out.println("two----------------two");
        return "forward:/two/demo.action";
    }

    @RequestMapping("/three")
    public String three(){
        System.out.println("three=============three");
        return "redirect:/admin/main.jsp";
    }

    @RequestMapping("/four")
    public String four(){
        System.out.println("four+++++++++++++++++four");
        return "redirect:/two/demo.action";
    }
}
