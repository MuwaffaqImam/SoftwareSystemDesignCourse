package com.muwaffaq.innopolis.lab02.encapsulation;

public class Man {

    private String name;
    private String secrets;
    private String car;
    private double salary;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecrets() {
        return secrets;
    }

    public void setSecrets(String secrets) {
        this.secrets = secrets;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
