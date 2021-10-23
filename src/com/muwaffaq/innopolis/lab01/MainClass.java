package com.muwaffaq.innopolis.lab01;

public class MainClass {


    public static void main(String[] args) {

        Cat catObject= new Cat("Fluffy","Tuna",true);
        System.out.println(catObject.name);
        System.out.println(catObject.isCute);
        System.out.println(catObject.foodType);
        catObject.makeSound();

        System.out.println("------");
        Cat cat2= new Cat("Fuzzy","Fish",false);
        System.out.println(cat2.name);
        System.out.println(cat2.isCute);
        System.out.println(cat2.foodType);

        cat2.makeSound();
        System.out.println("------");

        Cat cat3= new Cat("Fushhshs","meat",true);
        System.out.println(cat3.name);
        System.out.println(cat3.isCute);
        System.out.println(cat3.foodType);

        cat3.makeSound();













//


    }

}
