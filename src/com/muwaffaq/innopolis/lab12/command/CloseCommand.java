package com.muwaffaq.innopolis.lab12.command;

public class CloseCommand implements  Command {

    Switchable switchable;

    public CloseCommand(Switchable switchable) {
        this.switchable = switchable;
    }

    @Override
    public void execute() {
        switchable.off();
    }
}
