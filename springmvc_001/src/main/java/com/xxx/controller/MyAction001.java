package com.xxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/one")
public class MyAction001 {

//    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    @GetMapping("/demo")
    public String get(){
        System.out.println("oneGet................");
        return "main";
    }

//    @RequestMapping(value = "/demo",method = RequestMethod.POST)
    @PostMapping("/demo")
    public String demo(){
        System.out.println("onePost................");
        return "main";
    }
}
