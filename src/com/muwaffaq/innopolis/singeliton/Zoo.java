package com.muwaffaq.innopolis.singeliton;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<Animal> animalList;

    static public final Zoo instance = new Zoo();
    static public Zoo getInstance() {
        return instance;
    }

    private Zoo() {
        this.animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void displayAnimals() {
        System.out.printf("We have %d Animals in the zoo", animalList.size());
    }
}
