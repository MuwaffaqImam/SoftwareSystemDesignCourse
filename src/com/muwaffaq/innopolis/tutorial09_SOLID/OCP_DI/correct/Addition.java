package com.muwaffaq.innopolis.tutorial09_SOLID.OCP_DI.correct;

public class Addition implements Operation {
    private double left, right;

    public Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double operate() {
        System.out.println("Making addition");
        return left + right;
    }
}
