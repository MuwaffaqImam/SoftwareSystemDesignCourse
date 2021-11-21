package com.muwaffaq.innopolis.lab02.animal;

public abstract class Animal {
    public String name;
    public String animalType;


    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public abstract void eat();

    public void addToZoo(){
        Zoo zoo = Zoo.getInstance();
        zoo.addAnimal(this);
    }



    public Animal() {
    }

    public Animal(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
    }


    public void printMe() {
        System.out.println("im inside Animal");
        System.out.println("name " + name);
        System.out.println("type " + animalType);
    }

}
