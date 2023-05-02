package com.muwaffaq.innopolis.tutorial09_SOLID.OCP_DI.correct;

public class Subtraction implements Operation {

    double right, left;

    public Subtraction(double right, double left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double operate() {
        System.out.println("Making Subtraction");
        return left - right;
    }
}
