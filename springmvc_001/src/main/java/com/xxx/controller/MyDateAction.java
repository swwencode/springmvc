package com.xxx.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MyDateAction {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @RequestMapping("mydate")
    public String myDate(Date date, HttpServletRequest request){
        System.out.println("原样：" + date);
        System.out.println("术后：" + sdf.format(date));

        request.setAttribute("yuan" ,date);
        request.setAttribute("hou" ,sdf.format(date));
        request.setAttribute("three",date);
        return "showDate";
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
    }

}
