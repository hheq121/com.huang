package com.rbc;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl()  ;

        ProxyInvocationHandler proxyInvocationHandler=new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);

        UserService proxy= (UserService) proxyInvocationHandler.getProxy();
        proxy.add();

    }
}
