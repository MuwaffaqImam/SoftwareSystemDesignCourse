package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Visitor.Solution;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
