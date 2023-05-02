package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory.pr;

import com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory.Rectangle;
import com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory.Shape;
import com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory.Square;
import com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory.Triangle;


/**
 * WE want to create a Factory for shapes. We want to produce mass identical Shapes of
 * Squares, Rectangle and Triangle. what Design pattern can help us with mass production of object creation?
 */
public class Factory {

    enum ShapeSelection {SQUARE,TRIANGLE,RECTANGLE}
    public Shape getShapes(ShapeSelection selection){
        switch (selection){
            case SQUARE -> new Square(3);
            case TRIANGLE -> new Triangle(3,2,1);
            case RECTANGLE -> new Rectangle(2,3);
        }
        return null;
    }



    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.getShapes(ShapeSelection.RECTANGLE);
        factory.getShapes(ShapeSelection.SQUARE);
        factory.getShapes(ShapeSelection.TRIANGLE);
        factory.getShapes(ShapeSelection.SQUARE);
        factory.getShapes(ShapeSelection.RECTANGLE);
        factory.getShapes(ShapeSelection.TRIANGLE);

    }
}
