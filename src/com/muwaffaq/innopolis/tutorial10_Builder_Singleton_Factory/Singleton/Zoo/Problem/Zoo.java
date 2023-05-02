package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Singleton.Zoo.Problem;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    // to object it will run as how many times you initialize an object
    private List<AnimalZoo> animalList;


    Zoo() {
        animalList = new ArrayList<>();
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
