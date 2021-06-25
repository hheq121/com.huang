package com.huang.controller;

import com.huang.pojo.User;
import com.huang.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServices userServices;


    @ResponseBody
    @RequestMapping(value = "/user/getUser", method = {RequestMethod.GET,RequestMethod.POST} )
    public List<User> getUser(){
        List<User> result= userServices.SelectUser();
        System.out.println("调用成功");

        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/user/getUser2", method = {RequestMethod.GET,RequestMethod.POST} )
    public String getUser2(){
        List<User> result= userServices.SelectUser();
        System.out.println("调用成功");
        return "12222222";
    }
}
