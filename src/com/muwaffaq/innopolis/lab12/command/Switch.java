package com.muwaffaq.innopolis.lab12.command;

/**
 * The Invoker class
 **/
public class Switch {

    Command open;
    Command close;

    public Switch(Command open, Command close) {
        this.open = open;
        this.close = close;
    }

    public void close() {
        close.execute();
    }

    public void open() {
        open.execute();
    }


}
