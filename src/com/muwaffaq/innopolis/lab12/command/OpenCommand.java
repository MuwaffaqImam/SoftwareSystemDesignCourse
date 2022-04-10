package com.muwaffaq.innopolis.lab12.command;

public class OpenCommand implements Command {

    Switchable switchable;

    public OpenCommand(Switchable switchable) {
        this.switchable = switchable;
    }

    @Override
    public void execute() {
        switchable.on();
    }
}
