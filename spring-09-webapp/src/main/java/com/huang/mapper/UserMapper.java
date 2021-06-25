package com.huang.mapper;

import com.huang.pojo.User;

import java.util.List;


public interface UserMapper {
    public List<User>  SelectUser();

    public void AddUser(User user);

    public void DeleteUser(int id);

}
