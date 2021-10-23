package com.muwaffaq.innopolis.lab02.labwork;

public class Square extends Shape {

   private String name;

    public Square(double width, double height, String name) {
        super(width, height);
        this.name = name;
    }


    @Override
   public double area() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
