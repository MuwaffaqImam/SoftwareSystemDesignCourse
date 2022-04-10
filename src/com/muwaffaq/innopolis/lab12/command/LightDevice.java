package com.muwaffaq.innopolis.lab12.command;

/** The Receiver class */
public class LightDevice implements  Switchable {

    @Override
    public void on() {
        System.out.println("light is ON");
    }

    @Override
    public void off() {
        System.out.println("light is OFF");
    }
}
