package com.muwaffaq.innopolis.lab10.singleton;

public abstract class AnimalZoo {
    public String name;


    public AnimalZoo(String name) {
        this.name = name;
    }

    public abstract void entertain();

    public void addToZoo(){
        Zoo zoo = Zoo.getInstance();
        zoo.addAnimal(this);
    }



    public void printMe() {
        System.out.println("im inside Animal");
        System.out.println("name " + name);
    }

}
