package com.muwaffaq.innopolis.tutorial09_SOLID.OCP_DI.correct;

 class Calculator {
    double result;

    double calculate(Operation operation) {
       return result = operation.operate();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Addition addition = new Addition(5, 6);
        calculator.calculate(addition);
        Subtraction subtraction = new Subtraction(4, 3);
        calculator.calculate(subtraction);
    }

}
