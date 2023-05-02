package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Visitor.Problem;

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

        double totalArea = 0;
        for (Shape s : shapes) {
            if (s instanceof Circle)
                totalArea += Math.PI * ((Circle) s).getRadius() * ((Circle) s).getRadius();
            if (s instanceof Rectangle)
                totalArea += ((Rectangle) s).getWidth() * ((Rectangle) s).getHeight();
            if (s instanceof Square)
                totalArea += (((Square) s).getSide())^2;
        }

        System.out.println("Total area is:");
        System.out.println(totalArea);

    }
}
