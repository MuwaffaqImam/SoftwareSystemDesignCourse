package com.muwaffaq.innopolis.oop.shapes;

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

    public void changeRadiousInCircle(double radious){
        Circle circle = new Circle(10,20,40,"circle");
        circle.setRadius(40);
    }

    public void setName(String name) {
        this.name = name;
    }

}
