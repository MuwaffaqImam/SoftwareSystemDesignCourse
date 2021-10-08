package com.muwaffaq.innopolis.oop;

public class Cat  extends Animal implements Playable {
   private String name;
   private String catType;

    public Cat(String name, String catType) {
        this.name = name;
        this.catType = catType;
    }

    void makeSound(){
        System.out.println("meow");
    }

    void pet(){
        System.out.println("i'm playing in the house");
    }


    public String getName() {
        return name;
    }

    public String getCatType() {
        return catType;
    }


    @Override
    void eat() {

    }

    @Override
    public void play() {

    }
}
