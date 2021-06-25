package com.rbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class user {

    @Autowired
    private dog dog;

    @Autowired
    private  cat cat;

    @Value("lilieik")
    private String Name;

    public void speack(){
        System.out.printf(String.format( "person space %s ",Name));
    }

}
