package com.muwaffaq.innopolis.lab10.singleton.Zoo.Correct;


public class MainSingleton {


    public static void main(String[] args) {
        AnimalZoo cat = new Cat();
        cat.addToZoo();
        Zoo zoo = Zoo.getInstance();
        zoo.displayAnimals();
    }


}
