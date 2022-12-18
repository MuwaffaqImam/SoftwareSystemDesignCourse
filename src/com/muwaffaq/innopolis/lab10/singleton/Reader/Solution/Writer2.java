package com.muwaffaq.innopolis.lab10.singleton.Reader.Solution;

public class Writer2 {


    public void write() {
        System.out.println("Writer 2 is writing");
        System.out.println(TransitionWords.getInstance().getRandomTransition());
    }
}
