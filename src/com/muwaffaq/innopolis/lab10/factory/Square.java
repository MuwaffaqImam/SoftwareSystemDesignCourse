package com.muwaffaq.innopolis.lab10.factory;

public class Square implements Perimeter {

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
