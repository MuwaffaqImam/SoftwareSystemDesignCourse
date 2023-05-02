package com.muwaffaq.innopolis.tutorial13_Bridge_Memento_Iterator.bridge.Solution;

public class Main {


    public static void main(String[] args) {
        Circle circle = new Circle(new Red());;
        circle.draw();
        circle.setColor(new Green());
        circle.draw();
        circle.setColor(new Blue());
        circle.draw();
    }
}
