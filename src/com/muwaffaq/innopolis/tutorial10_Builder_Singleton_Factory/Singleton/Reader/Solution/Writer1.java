package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Singleton.Reader.Solution;

public class Writer1 {
    public void write() {
        System.out.println("Writer 1 is writing");
        System.out.println(TransitionWords.getInstance().getRandomTransition());
    }
}
