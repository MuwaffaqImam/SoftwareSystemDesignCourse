package com.muwaffaq.innopolis.lab09.LSP_IS.wrong;

// liskov principle the parent and the child can be reliable
public class Duck implements Bird {

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void hatch() {
        System.out.println("laying eggs");
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
