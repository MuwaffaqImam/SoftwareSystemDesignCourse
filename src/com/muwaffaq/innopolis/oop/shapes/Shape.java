package com.muwaffaq.innopolis.oop.shapes;

public class Shape {

   protected double width;
   protected double height;
   protected String name;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }



    public double area(){
       return 0;
    }


    public String getName() {
        return name;
    }
}
