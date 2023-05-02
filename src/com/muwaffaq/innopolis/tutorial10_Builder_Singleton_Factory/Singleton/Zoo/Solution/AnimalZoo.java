package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Singleton.Zoo.Solution;

public abstract class AnimalZoo {


    public abstract void entertain();

    public void addToZoo() {
        Zoo zoo = Zoo.getInstance();
        zoo.addAnimal(this);
    }


}
