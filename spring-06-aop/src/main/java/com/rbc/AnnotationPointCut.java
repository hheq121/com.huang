package com.rbc;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class AnnotationPointCut {

    @Before( "execution(* com.rbc.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("========方法执行前");
    }
    @After("execution(* com.rbc.UserServiceImpl.*(..))")
    public  void After()
    {
        System.out.println("========方法执行后");
    }
}
