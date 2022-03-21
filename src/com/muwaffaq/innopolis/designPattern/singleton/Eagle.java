package com.muwaffaq.innopolis.designPattern.singleton;

public class Eagle extends AnimalZoo {
    String eagleType;


    public Eagle(String name) {
        super(name);
    }


    @Override
    public void entertain() {
        System.out.println("Hunt in a sharp way");

    }
}
