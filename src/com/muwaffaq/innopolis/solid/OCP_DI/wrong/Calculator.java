package com.muwaffaq.innopolis.solid.OCP_DI.wrong;

//❌❌❌❌
// how many SOLID Principle does it violate ?
// Fix it !!

// l - r
// r + l
// DI : high = Abstract class
// low : classes
//
public class Calculator {
    private double left;
    private double right;

     enum Operation {ADD, SUBTRACT, DIVIDE,MULTIPLICATION}

    public double calculate(Operation operation) {
        double result;
        switch (operation) {
            case ADD:
                result = left + right;
                break;
            case SUBTRACT:
                result = left - right;
                break;
            default:
            case DIVIDE:
                result = left / right;
                break;
        }
        return result;
    }

    void main() {
        Calculator calculator = new Calculator();
        calculator.calculate(Operation.ADD);
        calculator.calculate(Operation.SUBTRACT);
    }

}


