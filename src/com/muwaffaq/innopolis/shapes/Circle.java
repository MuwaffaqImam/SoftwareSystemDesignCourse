package com.muwaffaq.innopolis.shapes;

public class Circle extends Shape {

   private double radius;
   private String name;
    public Circle(double width, double height, double radius, String name) {
        super(width, height);
        this.radius = radius;
        this.name = name;
    }


    @Override
    public double area() {
        return super.area();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
