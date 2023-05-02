package com.muwaffaq.innopolis.tutorial09_SOLID.OCP_DI.correct;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(new Subtraction(4,5)));
        System.out.println(calculator.calculate(new Addition(4,5)));
    }
}
