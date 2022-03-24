package com.muwaffaq.innopolis.lab10.factory;

public class Triangle implements Perimeter {

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

