package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Visitor.Solution;

public class Square implements Shape {


   private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
