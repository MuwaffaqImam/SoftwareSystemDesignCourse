package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Visitor.Problem;

public class Circle implements Shape {

   private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
