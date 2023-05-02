package com.muwaffaq.innopolis.tutorial15_chain_command_template.command.Solution;

public class RemoteControl {

    Command command;

    public RemoteControl() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    void pressButton() {
        if (command != null) {
            command.execute();
        }
    }
}
