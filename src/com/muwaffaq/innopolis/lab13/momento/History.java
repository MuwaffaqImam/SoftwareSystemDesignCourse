package com.muwaffaq.innopolis.lab13.momento;

import java.util.ArrayDeque;

public class History<T> {

    ArrayDeque<Momento<T>> history = new ArrayDeque<Momento<T>>();

    void push(T command) {
        history.push(new Momento<>(command));
    }

    Momento<T> undo() {
        Momento<T> pop = history.pop();
        if (history.isEmpty())
            return pop;
        return history.peek();
    }


}
