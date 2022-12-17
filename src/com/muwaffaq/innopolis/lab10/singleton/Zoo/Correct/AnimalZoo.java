package com.muwaffaq.innopolis.lab10.singleton.Zoo.Correct;

public abstract class AnimalZoo {


    public abstract void entertain();

    public void addToZoo() {
        Zoo zoo = Zoo.getInstance();
        zoo.addAnimal(this);
    }


}
