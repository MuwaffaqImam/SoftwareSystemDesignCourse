package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Singleton.Reader.Solution;

public class Writer2 {


    public void write() {
        System.out.println("Writer 2 is writing");
        System.out.println(TransitionWords.getInstance().getRandomTransition());
    }
}
