package com.xxx.controller;

import com.xxx.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class MyAction006 {

    @RequestMapping("/data")
    public String data(
            HttpServletRequest request,
            HttpServletResponse response,
            HttpSession session,
            ModelMap modelMap,
            Model model,
            Map map

    ){
        Student stu = new Student("小灰灰",18);
        request.setAttribute("requestStu",stu);
        session.setAttribute("sessionStu",stu);
        model.addAttribute("modelStu",stu);
        map.put("mapStu",stu);
        modelMap.addAttribute("modelMapStu",stu);
        return "main";
    }

    @RequestMapping("datatwo")
    public String dataTwo(HttpServletRequest request){
        List<Student> list = new ArrayList<>();
        Student stu1 = new Student("小灰灰",18);
        Student stu2 = new Student("小苏苏",18);
        Student stu3 = new Student("老狐狸",24);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        request.setAttribute("list",list);
        return "main";
    }


}
