package com.muwaffaq.innopolis.tutorial13_Bridge_Memento_Iterator.memento.Solution;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.type("The quick brown fox jumps over the lazy dog.");
        history.add(editor.save());

        editor.type("Lorem ipsum dolor sit amet.");
        history.add(editor.save());

        editor.type("Consectetur adipiscing elit.");
        history.add(editor.save());

        editor.restore(history.get(1));
        System.out.println(editor.getContent());

        editor.restore(history.get(2));
        System.out.println(editor.getContent());


        // Output: The quick brown fox jumps over the lazy dog.Lorem ipsum dolor sit amet.
    }
}