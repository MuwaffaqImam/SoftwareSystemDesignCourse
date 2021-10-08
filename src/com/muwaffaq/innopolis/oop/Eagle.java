package com.muwaffaq.innopolis.oop;

public class Eagle extends Animal implements Flyable {
    String name;
    String eagleType;

    public Eagle(String name, String eagleType) {
        this.name = name;
        this.eagleType = eagleType;
    }

    void makeSound(){
        System.out.println("Egalesssssss.");
    }

    void hunt(){
        System.out.println("i'm hunting prays");
    }


    @Override
    void eat() {

    }

    @Override
    public void fly() {

    }
}
