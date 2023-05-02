package com.muwaffaq.innopolis.tutorial15_chain_command_template.command.Solution;

public class Main {


    public static void main(String[] args) {

        Light green = new Light();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new SwitchOnCommand(green));
        remoteControl.pressButton();
        remoteControl.setCommand(new SwitchOffCommand(green));
        remoteControl.pressButton();
    }
}
