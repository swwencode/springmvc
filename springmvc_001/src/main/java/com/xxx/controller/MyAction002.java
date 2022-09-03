package com.xxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/two")
public class MyAction002 {

    @RequestMapping("/demo")
    public String demo(){
        System.out.println("two...................");
        return "main";
    }
}
