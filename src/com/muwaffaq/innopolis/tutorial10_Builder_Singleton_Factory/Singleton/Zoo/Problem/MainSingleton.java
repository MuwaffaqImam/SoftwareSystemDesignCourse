package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Singleton.Zoo.Problem;


public class MainSingleton {


    public static void main(String[] args) {
            AnimalZoo cat = new Cat();
            AnimalZoo duck = new Duck();
            cat.addToZoo();
            duck.addToZoo();
    }


}
