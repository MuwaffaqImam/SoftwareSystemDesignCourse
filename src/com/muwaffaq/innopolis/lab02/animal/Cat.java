package com.muwaffaq.innopolis.lab02.animal;

public class Cat extends Animal implements Playable {
    public double catPrice;



    @Override
    public void eat() {
    }

    public Cat(String catName) {
        super(catName);

    }


    public void makeCatSound() {
        System.out.println("meow , ru ry");
    }


    @Override
    public void play() {
        System.out.println("im playing with you as a cute cat");
    }
}
