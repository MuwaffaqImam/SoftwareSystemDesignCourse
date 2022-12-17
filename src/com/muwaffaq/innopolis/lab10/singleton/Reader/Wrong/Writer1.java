package com.muwaffaq.innopolis.lab10.singleton.Reader.Wrong;

public class Writer1 {


    public void write() {
        System.out.println("Writer 1 is writing");
        System.out.println(new TransitionWords().getRandomTransition());
    }
}
