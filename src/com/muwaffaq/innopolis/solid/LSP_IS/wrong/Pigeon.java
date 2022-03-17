package com.muwaffaq.innopolis.solid.LSP_IS.wrong;

// liskov principle the parent and the child can be reliable
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
