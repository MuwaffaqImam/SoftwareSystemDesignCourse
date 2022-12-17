package com.muwaffaq.innopolis.lab10.singleton.Zoo.Correct;


public class MainSingleton {


    public static void main(String[] args) {
        AnimalZoo cat = new Cat("cat");
        AnimalZoo eagle = new Eagle("Eagle");
        cat.addToZoo();
        eagle.addToZoo();
        Zoo zoo = Zoo.getInstance();
        zoo.displayAnimals();
    }


}
