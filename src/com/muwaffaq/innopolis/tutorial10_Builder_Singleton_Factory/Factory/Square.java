package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory;

public class Square implements Shape {

    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calculate() {
        System.out.println("Drawing Square with Perimeter : ");
        System.out.println(side*4);
    }


}
