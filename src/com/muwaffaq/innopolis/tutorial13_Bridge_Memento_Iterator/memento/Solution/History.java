package com.muwaffaq.innopolis.tutorial13_Bridge_Memento_Iterator.memento.Solution;

import java.util.ArrayList;
import java.util.List;

// Caretaker class
class History {
    private final List<EditorMemento> mementos = new ArrayList<>();

    public void add(EditorMemento memento) {
        mementos.add(memento);
    }

    public EditorMemento get(int index) {
        return mementos.get(index);
    }
}
