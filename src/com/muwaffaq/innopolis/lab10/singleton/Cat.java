package com.muwaffaq.innopolis.lab10.singleton;

public class Cat extends AnimalZoo {

    @Override
    public void entertain() {
        System.out.println("Play with wool");
    }

    public Cat(String name) {
        super(name);
    }


}
