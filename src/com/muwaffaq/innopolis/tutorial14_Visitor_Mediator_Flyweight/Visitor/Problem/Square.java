package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Visitor.Problem;

public class Square implements Shape {


   private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
