package com.muwaffaq.innopolis.tutorial15_chain_command_template.command.Solution;

public class Light {

    boolean isOn;

    public void turnOn(){
        isOn=true;
        System.out.println("Turning the light on");
    }
    public void turnOff(){
        isOn=false;
        System.out.println("Turning the light off");
    }


}
