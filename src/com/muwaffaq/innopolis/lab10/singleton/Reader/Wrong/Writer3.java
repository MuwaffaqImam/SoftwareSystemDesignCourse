package com.muwaffaq.innopolis.lab10.singleton.Reader.Wrong;

public class Writer3 {


    public void write() {
        System.out.println("Writer 3 is writing");
        System.out.println( new TransitionWords().getRandomTransition());
    }
}
