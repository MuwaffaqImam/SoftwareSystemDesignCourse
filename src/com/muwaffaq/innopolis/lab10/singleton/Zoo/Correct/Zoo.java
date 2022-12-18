package com.muwaffaq.innopolis.lab10.singleton.Zoo.Correct;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<AnimalZoo> animalList;

    static public final Zoo instance = new Zoo();

    static public Zoo getInstance() {
        return instance;
    }

    private Zoo() {
        this.animalList = new ArrayList<>();
    }

    public void addAnimal(AnimalZoo animal) {
        animalList.add(animal);
    }

    public void displayAnimals() {
        System.out.printf("We have %d Animals in the zoo \n", animalList.size());
        System.out.println("All Animal Must Entertain: ");
        animalList.forEach(animalZoo -> {
            animalZoo.entertain();
        });
    }
}
