package com.rbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public  static  void main(String[] args){


        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml") ;
        MyUserService myUserService= (MyUserService) context.getBean("myUserService");
        myUserService.show();


    }
}
