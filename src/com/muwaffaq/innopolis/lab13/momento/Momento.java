package com.muwaffaq.innopolis.lab13.momento;

public class Momento<T> {

    private final T state;

    public Momento(T state) {
        this.state = state;
    }

    public T getState() {
        return state;
    }
}
