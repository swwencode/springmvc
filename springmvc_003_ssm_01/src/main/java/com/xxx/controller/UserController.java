package com.xxx.controller;

import com.xxx.pojo.User;
import com.xxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    public static final int PAGE_SIZE=5;

    @RequestMapping("/selectUserPage")
    @ResponseBody
    public List<User> selectUserPage(String userName, String userSex,Integer page){
        if (page == null){
            page = 1;
        }
        return userService.selectUserPage(userName,userSex,page,PAGE_SIZE);
    }

    @RequestMapping("/getRowCount")
    @ResponseBody
    public int getRowCount(String userName,String userSex){
        return userService.getRowCount(userName,userSex);
    }

    @RequestMapping("/deleteUserById")
    @ResponseBody
    public int deleteUserById(String userId){
        return userService.deleteUserById(userId);
    }

    @RequestMapping("/createUser")
    @ResponseBody
    public int createUser(User user){
        String userId = System.currentTimeMillis()+"";
        int num = (int)(Math.random()*(9999-1000+1)+1000);
        user.setUserId(userId+num);
        return userService.createUser(user);
    }

    @RequestMapping("/updateUserById")
    @ResponseBody
    public int updateUserById(User user){
        return userService.updateUserById(user);
    }

}
