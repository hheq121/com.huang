package com.rbc;

public class Host implements Hoster {
    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
