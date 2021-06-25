package com.huang08.controller;

import com.huang08.pojo.User;
import com.huang08.services.UserServices;
import org.apache.ibatis.executor.ReuseExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class UserController {

    @Autowired
    private UserServices userServices;


    @ResponseBody
    @RequestMapping(value = "/user08/getUser", method = {RequestMethod.GET} )
    public List<User> getUser(){
        List<User> result= userServices.SelectUser();
        System.out.println("调用成功");

        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/user08/getUser2", method = {RequestMethod.GET,RequestMethod.POST} )
    public String getUser2(){
        List<User> result= userServices.SelectUser();
        System.out.println("调用成功");
        return "12222222";
    }
}
