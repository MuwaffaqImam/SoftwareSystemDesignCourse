package com.muwaffaq.innopolis.tutorial09_SOLID.LSP_IS.wrong;

// liskov principle the parent and the child can be replaced with each other and no problem occurs
public class Pigeon implements Bird {
    
    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void hatch() {
        System.out.println("laying eggs");
    }
    /// ❌ ❌ ❌ ❌ violate Liskov Principle
    /// Pigeon can't swim
    @Override
    public void swim() {
        System.out.println("I can't swim");
    }
}
