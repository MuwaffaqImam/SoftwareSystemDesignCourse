package com.muwaffaq.innopolis.lab12.command;

public class Main {


    public static void main(String[] args) {

        Switchable lamp = new LightDevice();
        Command openCommand = new OpenCommand(lamp);
        Command closeCommand = new CloseCommand(lamp);
        Switch switchC = new Switch(openCommand, closeCommand);
        switchC.close();
        switchC.open();


    }


}
