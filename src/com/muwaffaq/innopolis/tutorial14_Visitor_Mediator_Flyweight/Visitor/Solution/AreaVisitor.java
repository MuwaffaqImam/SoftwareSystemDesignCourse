package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Visitor.Solution;

public class AreaVisitor implements ShapeVisitor {
    double totalArea = 0;

    @Override
    public void visit(Circle circle) {
        totalArea += Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public void visit(Rectangle rectangle) {
        totalArea += rectangle.getWidth() * rectangle.getHeight();
    }

    @Override
    public void visit(Square square) {
        totalArea += square.getSide() ^ 2;

    }

    public double getTotalArea() {
        return totalArea;
    }
}
