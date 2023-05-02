package com.muwaffaq.innopolis.tutorial15_chain_command_template.command.Solution;

public class SwitchOffCommand implements Command {

    Light light;

    public SwitchOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
