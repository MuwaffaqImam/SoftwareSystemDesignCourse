package com.muwaffaq.innopolis.lab02.encapsulation;

public class Man {

    public String name;
    private String secrets;
    protected double salary;
    String car;

    public String getName() {
        return name;
    }

    private String getSecrets() {
        return secrets;
    }

    protected double getSalary() {
        return salary;
    }

     String getCar() {
        return car;
    }
}
