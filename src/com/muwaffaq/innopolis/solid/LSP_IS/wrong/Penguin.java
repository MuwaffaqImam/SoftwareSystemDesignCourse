package com.muwaffaq.innopolis.solid.LSP_IS.wrong;


public class Penguin implements Bird {

    @Override
    public void fly() { }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void layEggs() {
        System.out.println("laying eggs");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }


}
