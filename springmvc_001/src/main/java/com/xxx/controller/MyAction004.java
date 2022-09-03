package com.xxx.controller;

import com.xxx.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyAction004 {

    @RequestMapping("/ajax")
    @ResponseBody
    public List<Student> ajax(){
        List<Student> list = new ArrayList<>();
        Student stu1 = new Student("小灰灰",18);
        Student stu2 = new Student("小苏苏",18);
        Student stu3 = new Student("老狐狸",24);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        return list;
    }
}
