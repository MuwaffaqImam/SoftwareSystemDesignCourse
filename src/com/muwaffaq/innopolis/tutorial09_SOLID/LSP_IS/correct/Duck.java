package com.muwaffaq.innopolis.tutorial09_SOLID.LSP_IS.correct;


// liskov princible the parent and the child can be relacable
public class Duck extends Bird implements Flyable, Swimmable, Hatchable {

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void hatch() {

    }

    @Override
    void eat() {

    }
}
