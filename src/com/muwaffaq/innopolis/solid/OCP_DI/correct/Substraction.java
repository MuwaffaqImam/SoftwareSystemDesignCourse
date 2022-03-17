package com.muwaffaq.innopolis.solid.OCP_DI.correct;

public class Substraction implements Operation {

    double right, left;

    public Substraction(double right, double left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double operate() {
        return left - right;
    }
}
