package com.huang08.mapper;

import com.huang08.pojo.User;


import java.util.List;


public interface UserMapper {
    public List<User>  SelectUser();

    public void AddUser(User user);

    public void DeleteUser( int id);

}
