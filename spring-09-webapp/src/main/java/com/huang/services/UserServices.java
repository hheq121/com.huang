package com.huang.services;

import com.huang.pojo.User;

import java.util.List;


public interface UserServices {

    public List<User> SelectUser();

    public void AddUser(User user) ;

    public void DeleteUser(int id);


}
