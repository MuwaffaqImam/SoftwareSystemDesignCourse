package com.muwaffaq.innopolis.designPattern.singleton;


public class MainSingleton {


    public static void main(String[] args) {
        AnimalZoo cat = new Cat("cat");
        AnimalZoo eagle = new Eagle("Eagle");
        cat.addToZoo();
        eagle.addToZoo();
        eagle.addToZoo();
        eagle.addToZoo();
        eagle.addToZoo();
        Zoo zoo = Zoo.getInstance();
        zoo.displayAnimals();

    }


}
