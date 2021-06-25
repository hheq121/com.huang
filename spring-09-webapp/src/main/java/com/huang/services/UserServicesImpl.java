package com.huang.services;

import com.huang.mapper.UserMapper;
import com.huang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserServicesImpl  implements  UserServices {

    @Autowired
    private SqlSession sqlSession;

    public List<User> SelectUser() {
        return sqlSession.getMapper(UserMapper.class).SelectUser();
    }

    public void AddUser(User user) {
        sqlSession.getMapper(UserMapper.class).AddUser(new User(1," name1","name1","name1"));
    }

    public void DeleteUser(int id) {
        sqlSession.getMapper(UserMapper.class).DeleteUser(id);
    }

    public void AddAndQuery() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.SelectUser());

        mapper.AddUser(new User(33,"ddd","ddd","dddd"));
        mapper.AddUser(new User(32,"ddd","ddd","dddd"));
        mapper.AddUser(new User(33,"ddd","ddd","dddd"));
        mapper.DeleteUser(12);
        mapper.DeleteUser(12);

        System.out.println(mapper.SelectUser());
    }

}
