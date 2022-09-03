package com.xxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyAction007 {

    @RequestMapping("/showIndex")
    public String showIndex(){
        return "index";
    }
    @RequestMapping("/showMain")
    public String showMain(){
        return "main";
    }

    @RequestMapping("/showLogin")
    public String showLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(String name, String password, HttpServletRequest request){
        if ("admin".equals(name) && "123456".equals(password)){
            request.getSession().setAttribute("flag", name);
            return "main";
        }else {
            request.setAttribute("msg","登录失败，账号或密码输入有误！");
            return "login";
        }
    }
}
