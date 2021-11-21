package com.muwaffaq.innopolis.lab02.labwork;

import java.util.ArrayList;

public class ShapesManager {

    static ShapesManager instance;
    private final ArrayList<Shape> shapes;

    public static ShapesManager getInstance() {
        if (instance == null)
            return new ShapesManager();
        else
            return instance;
    }

    private ShapesManager() {
        this.shapes = new ArrayList<>();
    }


    public void registerShape(Shape shape) {
        shapes.add(shape);
    }

    public void displayShapes() {
        System.out.printf(" we have :%d Shapes :\n", shapes.size());
        for (Shape a : shapes) {
            System.out.println(a.getName());
        }
    }


}
