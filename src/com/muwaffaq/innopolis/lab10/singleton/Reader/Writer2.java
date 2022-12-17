package com.muwaffaq.innopolis.lab10.singleton.Reader;

import com.muwaffaq.innopolis.lab10.singleton.Reader.Wrong.TransitionWords;

public class Writer2 {


    public void write() {
        System.out.println("Writer 2 is writing");
        System.out.println(new TransitionWords().getRandomTransition());
    }
}
