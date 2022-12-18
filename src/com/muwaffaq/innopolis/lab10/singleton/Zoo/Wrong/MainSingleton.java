package com.muwaffaq.innopolis.lab10.singleton.Zoo.Wrong;


public class MainSingleton {


    public static void main(String[] args) {
            AnimalZoo cat = new Cat();
            AnimalZoo duck = new Duck();
            cat.addToZoo();
            duck.addToZoo();
    }


}
