package com.muwaffaq.innopolis.lab_SOLID.LSP_IS.correct;



public class MainClass {

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        Bird penguin = new Penguin();
        Bird duck = new Duck();
        mainClass.functionOfBirds(duck);
        mainClass.functionOfBirds(penguin);

    }

    void functionOfBirds(Bird bird){
    }
}
