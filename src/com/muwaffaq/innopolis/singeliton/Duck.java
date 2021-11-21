package com.muwaffaq.innopolis.singeliton;

public class Duck extends Animal implements Flyable, Playable {
    @Override
   public void eat() {

    }


    @Override
    public void fly() {
        System.out.println(" a duck can Fly");
    }

    @Override
    public void play() {
        System.out.println("plying with ducks");
    }
}
