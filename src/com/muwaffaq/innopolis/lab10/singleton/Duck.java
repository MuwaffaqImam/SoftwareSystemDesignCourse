package com.muwaffaq.innopolis.lab10.singleton;

public class Duck extends AnimalZoo {

    public Duck(String name) {
        super(name);
    }

    @Override
   public void entertain() {
        System.out.println("Swim in a funny way");
    }


}
