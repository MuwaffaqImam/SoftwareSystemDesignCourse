package com.muwaffaq.innopolis.solid.LSP_IS.correctYoutube;


// liskov princible the parent and the child can be relacable
public class Duck extends Bird implements Flyable, Swimmable, Hatchable {

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void layEggs() {

    }

    @Override
    void eat() {

    }
}
