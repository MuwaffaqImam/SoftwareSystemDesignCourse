package com.muwaffaq.innopolis.IP.Inheritance;

public abstract class Person {
    protected String lastname;
    protected String firstName;

    public Person(String lastname, String firstName) {
        this.lastname = lastname;
        this.firstName = firstName;
    }

    protected abstract void introduce();
    protected abstract void report();

}
