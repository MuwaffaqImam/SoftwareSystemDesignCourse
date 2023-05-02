package com.muwaffaq.innopolis.tutorial13_Bridge_Memento_Iterator.bridge.Solution;



public class Circle implements Shape{
    Colors color;

    public Circle(Colors color) {
        this.color = color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("drawing Circle");
        color.applyColor();
    }
}
