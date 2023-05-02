package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Visitor.Solution;

public interface ShapeVisitor {

    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Square square);


}
