package com.rbc;

public class UserServiceImpl implements UserService {
    @Override
    public void Add() {
        System.out.println("执行了添加方法");
    }

    @Override
    public void Delete() {
        System.out.println("执行了删除方法");
    }

    @Override
    public void Edit() {
        System.out.println("执行了编辑方法");
    }

    @Override
    public void Query() {
        System.out.println("执行了查询方法");
    }
}
