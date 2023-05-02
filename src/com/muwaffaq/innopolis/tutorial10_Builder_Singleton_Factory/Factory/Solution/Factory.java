package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory.Solution;
import com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory.Shape;
import com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory.Rectangle;
import com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory.Square;
import com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory.Triangle;

/**
 *
 */
public class Factory {
    enum Shapes {SQUARE, TRIANGLE, RECTANGLE}
    public Shape getShape(Shapes shape) {
        return switch (shape) {
            case SQUARE -> new Square(2);
            case TRIANGLE -> new Triangle(1, 2, 3);
            case RECTANGLE -> new Rectangle(2, 3);
        };
    }
    void printPerimeter(Shape perimeter) {
        perimeter.calculate();
    }


    public static void main(String[] args) {
        Factory  factory = new Factory();
        factory.printPerimeter(factory.getShape(Shapes.SQUARE));
        factory.printPerimeter(factory.getShape(Shapes.TRIANGLE));
        factory.printPerimeter(factory.getShape(Shapes.RECTANGLE));
    }

}
