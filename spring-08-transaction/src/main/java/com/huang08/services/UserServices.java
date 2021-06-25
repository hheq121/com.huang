package com.huang08.services;

import com.huang08.mapper.UserMapper;
import com.huang08.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface UserServices {

    public List<User> SelectUser();

    public void AddUser(User user) ;

    public void DeleteUser(int id);


}
