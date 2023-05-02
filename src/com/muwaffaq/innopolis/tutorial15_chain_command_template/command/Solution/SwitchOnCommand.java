package com.muwaffaq.innopolis.tutorial15_chain_command_template.command.Solution;

public class SwitchOnCommand implements Command {

    Light light;

    public SwitchOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
