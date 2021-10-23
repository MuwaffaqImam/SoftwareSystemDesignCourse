package com.muwaffaq.innopolis.lab02;

public class Cat    {
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


}
