package com.muwaffaq.innopolis.oop.Inheritance;

public class Father extends Person implements Provide {
    private double salary = 1000;
    Son son;

    public Father(String firstName, String lastName, Son son) {
        super(firstName, lastName);
        this.son = son;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    protected void introduce() {
        System.out.println("hello i am " + firstName + " " + lastname);
    }


    @Override
    public void payBills(double bills) {
        salary -= bills;

    }

    @Override
    public void giveAllowances(double allowance) {
        son.setAllowances(allowance);
        salary -= allowance;

    }

    @Override
    public void report() {
        introduce();
        System.out.println("the remaining salary = " + salary);
    }
}
