package com.xxx.test;


import com.xxx.mapper.UserMapper;
import com.xxx.pojo.User;
import com.xxx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml","classpath:applicationContext_service.xml"})
public class MyTest01 {
    @Autowired
    UserService userService;

    public static final int PAGE_SIZE = 5;
    //List<User> selectUserPage(String userName, String userSex,Integer page,int pageSize);
    @Test
    public void testSelectUserPage(){
        List<User> list = userService.selectUserPage("三","女",1,PAGE_SIZE);
        System.out.println(list);
        list.forEach(System.out::println);
    }
}
