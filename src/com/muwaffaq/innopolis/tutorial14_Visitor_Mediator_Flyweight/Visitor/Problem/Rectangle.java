package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Visitor.Problem;

public class Rectangle implements Shape{


    private int height,width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
