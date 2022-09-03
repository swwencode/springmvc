package com.xxx.controller;

import com.xxx.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;

@Controller
public class MyAction003 {

    @RequestMapping("/one")
    public String submitOne(String name,int age){
        System.out.println("姓名：" + name + "，年龄：" + age);
        return "main";
    }

    @RequestMapping("/two")
    public String submitTwo(Student stu){
        System.out.println(stu);
        return "main";
    }

    @RequestMapping("/three/{name}/{age1}")
    public String submitThree(
            @PathVariable
            String name,
            @PathVariable("age1")
            int age){
        System.out.println("姓名：" + name + "，年龄：" + age);
        return "main";
    }

    @RequestMapping("/four")
    public String submitFour(
            @RequestParam("name")
            String uName,
            @RequestParam("age")
            int uAge){
        System.out.println("请求参数名称与action方法参数名称不一致");
        System.out.println("姓名：" + uName + "，年龄：" + uAge);
        return "main";
    }

    @RequestMapping("/five")
    public String submitFive(HttpServletRequest request){
        System.out.println("手工提取");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println("姓名：" + name + "，年龄：" + Integer.parseInt(age));
        return "main";
    }
}
