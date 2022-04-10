package com.muwaffaq.innopolis.lab12.chain;

public class Main {


    public static void main(String[] args) {
        Nani nani = Nani.cryingBaby()
                .appendAction(Nani.feedBaby())
                .appendAction(Nani.batheBaby())
                .appendAction(Nani.sleepBaby());

        nani.action();
    }
}
