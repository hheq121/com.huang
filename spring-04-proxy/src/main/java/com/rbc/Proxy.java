package com.rbc;

public class Proxy implements Hoster {

    private Host host;


    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }
}
