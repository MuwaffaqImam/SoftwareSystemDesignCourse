package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory.Probrlem;

import com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory.Triangle;


/**
 * WE want to create a Factory for shapes. We want to produce mass identical Shapes of
 * Squares, Rectangle and Triangle. what Design pattern can help us with mass production of object creation?
 */
public class Factory {





    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,2,5);
        triangle.calculate();
        Triangle triangle2 = new Triangle(1,2,5);
        triangle2.calculate();
        Triangle triangle3 = new Triangle(1,2,5);
        triangle3.calculate();

    }
}
