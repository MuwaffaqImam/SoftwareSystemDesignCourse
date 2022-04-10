package com.muwaffaq.innopolis.lab13.momento;

public class Main {


    public static void main(String[] args) {
        Editor<String > todo = new Editor<>();
        todo.write("Write Stuff");
        todo.write("Go to Mall");
        todo.write("Go to painting");
        System.out.println("after undo: "+ todo.undo());
        System.out.println("after undo: "+ todo.undo());
    }
}
