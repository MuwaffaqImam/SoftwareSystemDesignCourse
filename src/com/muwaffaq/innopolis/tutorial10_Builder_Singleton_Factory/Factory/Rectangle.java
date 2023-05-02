package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory;

public class Rectangle implements Shape {

    int wide;
    int tall;

    public Rectangle(int wide, int tall) {
        this.wide = wide;
        this.tall = tall;
    }

    @Override
    public void calculate() {
        System.out.println("Drawing Rectangle with Perimeter : ");
        System.out.println(2 * (wide + tall));
    }


}
