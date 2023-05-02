package com.muwaffaq.innopolis.oop.Inheritance;

public class Son extends Person implements Study {
    private double allowances;

    public Son(String firstName, String lastname) {
        super(firstName,lastname);
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    @Override
    protected void introduce() {
        System.out.println("Hello my name is " + firstName + " " + lastname);
    }

    @Override
    public void study() {
        System.out.println("i am studying always ");
    }

    @Override
    public void buyBooks(double price) {
        allowances -= price;
    }

    @Override
    public void report() {
        introduce();
        study();
        System.out.println("I have this allowance remains" + allowances);
    }
}
