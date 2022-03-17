package com.muwaffaq.innopolis.solid.OCP_DI.correct;

public class Addition implements Operation {
    private double left, right;

    public Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double operate() {
        return left + right;
    }
}
