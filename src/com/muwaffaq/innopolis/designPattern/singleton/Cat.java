package com.muwaffaq.innopolis.designPattern.singleton;

public class Cat extends AnimalZoo {

    @Override
    public void entertain() {
        System.out.println("Play with wool");
    }

    public Cat(String name) {
        super(name);
    }


}
