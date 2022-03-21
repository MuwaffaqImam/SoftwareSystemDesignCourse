package com.muwaffaq.innopolis.designPattern.singleton;

public class Duck extends AnimalZoo {

    public Duck(String name) {
        super(name);
    }

    @Override
   public void entertain() {
        System.out.println("Swim in a funny way");
    }


}
