package com.muwaffaq.innopolis.tutorial13_Bridge_Memento_Iterator.memento.Solution;


// Originator class
public class Editor {

        private String content = "";

        public void type(String words) {
            content += words;
        }

        public String getContent() {
            return content;
        }

        public EditorMemento save() {
            return new EditorMemento(content);
        }

        public void restore(EditorMemento memento) {
            content = memento.getContent();
        }
    }

