package com.muwaffaq.innopolis.lab09.OCP_DI.wrong;

//❌❌❌❌
// how many SOLID Principle does it violate ?
// Fix it !!

// l - r
// r + l
// DI : high = Abstract class
// low : classes
//
 class CalculatorWrong {
    private double left;
    private double right;

    public CalculatorWrong(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public enum Operation {ADD, SUBTRACT, DIVIDE, MUL}

    /// ❌ ❌ ❌ ❌
    /// this function violates the OP principle
    /// because it depend on concrete classes enum
    public  double calculate(Operation operation) {
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

    public static void main(String[] args) {
        CalculatorWrong calculator = new CalculatorWrong(3,4);
        System.out.println(calculator.calculate(Operation.ADD));
        System.out.println(calculator.calculate(Operation.SUBTRACT));

    }

}


