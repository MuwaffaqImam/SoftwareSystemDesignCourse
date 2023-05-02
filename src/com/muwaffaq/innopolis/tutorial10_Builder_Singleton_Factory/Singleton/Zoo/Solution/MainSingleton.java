package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Singleton.Zoo.Solution;


public class MainSingleton {


    public static void main(String[] args) {
        AnimalZoo cat = new Cat();
        cat.addToZoo();
        Zoo zoo = Zoo.getInstance();
        zoo.displayAnimals();
    }


}
