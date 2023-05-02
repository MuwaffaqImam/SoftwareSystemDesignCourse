package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Singleton.Reader.Problem;

public class Writer3 {


    public void write() {
        System.out.println("Writer 3 is writing");
        System.out.println(new TransitionWords().getRandomTransition());
    }
}
