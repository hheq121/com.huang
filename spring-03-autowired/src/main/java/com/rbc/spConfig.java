package com.rbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class spConfig {

    @Bean
    public cat cat(){
        return  new cat();
    }

    @Bean
    public dog dog(){
        return  new dog();
    }

    @Bean
    public user user(){
        return  new user();
    }
}
