package com.muwaffaq.innopolis.tutorial13_Bridge_Memento_Iterator.iterator.Solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MyList implements Iterable<String> {
    private List<String> data = new ArrayList<>();

    public void add(String item) {
        data.add(item);
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < data.size();
        }

        @Override
        public String next() {
            return data.get(currentIndex++);
        }
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("one");
        myList.add("two");
        myList.add("three");

        for (String item : myList) {
            System.out.println(item);
        }
    }
}


