package com.muwaffaq.innopolis.singleton;

public class Eagle extends Animal implements Flyable {
    String eagleType;


    public Eagle(String type) {
        super(type);
    }

    void hunt(){
        System.out.println("i'm hunting prays");
    }



    public void makeEagleSound() {
        System.out.println("skweeeeeeeeeeeek");
    }

    @Override
    public void eat() {

    }


    @Override
    public void fly() {
        System.out.println("I can fly as an Eagle");
    }
}
