package com.muwaffaq.innopolis.lab_SOLID.LSP_IS.correct;




// liskov princible the parent and the child can be relacable
public class Penguin  extends  Bird implements Swimmable, Hatchable {

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
