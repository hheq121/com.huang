package com.huang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {


    @Autowired
    private Cat cat;

    @Autowired
    private Dog dog;


    @Autowired
    private  String Name ;

    public Cat getCat() {
        return cat;
    }



    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", Name='" + Name + '\'' +
                '}';
    }

}
