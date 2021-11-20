package com.muwaffaq.innopolis;


import com.muwaffaq.innopolis.lab02.animal.*;
import com.muwaffaq.innopolis.lab02.animal.Zoo;

public class Main {


    public static void main(String[] args) {

        Animal cat = new Cat("Fluffy");
        Animal eagle = new Eagle("Eagle");
        cat.addToZoo();
        eagle.addToZoo();
        Zoo zoo = Zoo.getInstance();
        zoo.showAnimal();


    }



}
