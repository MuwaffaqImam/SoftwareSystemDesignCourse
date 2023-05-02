package com.muwaffaq.innopolis.Intro;


// context Cat
public class Cat {
    boolean isCute;
    String name;
    String foodType;

    Cat(String catName, String catFood, boolean isCatCute) {
        name = catName;
        foodType = catFood;
        isCute = isCatCute;
    }


    void makeSound() {
        System.out.println("my cat "+name);
        System.out.println("always maks sound --> purrrrr");
    }

    void pet() {

    }

}
