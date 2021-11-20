package com.muwaffaq.innopolis.lab02.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animals;

    static Zoo instance;

    public static Zoo getInstance() {
        if (instance == null)
            return new Zoo();
        else
            return instance;
    }

    private Zoo() {
        this.animals = new ArrayList<>();
    }


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimal() {
        System.out.printf("in our zoo we have :%d Animal :\n", animals.size());
        for (Animal a : animals) {
            System.out.println(a.name);
        }
    }

}
