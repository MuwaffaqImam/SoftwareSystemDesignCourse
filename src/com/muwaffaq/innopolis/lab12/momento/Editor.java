package com.muwaffaq.innopolis.lab12.momento;

public class Editor<T> {

    History<T> history;

    public Editor() {
        this.history = new History<>();
    }

    public void write(T text) {
        System.out.println("Writing text : "+ text);
        history.push(text);
    }

    public T undo() {
        return history.undo().getState();
    }

}
