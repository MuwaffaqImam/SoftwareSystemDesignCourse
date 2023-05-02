package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Factory;

public class Triangle implements Shape {

    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void calculate() {
        System.out.println("Drawing Triangle with Perimeter : ");
        System.out.println(side1 + side2 + side3);
    }




}

