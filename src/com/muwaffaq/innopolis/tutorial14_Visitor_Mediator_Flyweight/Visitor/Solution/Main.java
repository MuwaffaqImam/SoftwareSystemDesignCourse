package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Visitor.Solution;

public class Main {


    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(3),
                new Rectangle(2, 4),
                new Circle(2.5),
                new Rectangle(3, 3),
                new Square(4),
                new Square(5),
        };

        AreaVisitor visitor = new AreaVisitor();

        for (Shape s : shapes) {
            s.accept(visitor);
        }

        System.out.println("Total Area");
        System.out.println(visitor.getTotalArea());


    }
}
