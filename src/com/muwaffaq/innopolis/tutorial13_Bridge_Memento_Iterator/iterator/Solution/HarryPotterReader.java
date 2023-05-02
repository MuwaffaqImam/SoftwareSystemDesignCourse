package com.muwaffaq.innopolis.tutorial13_Bridge_Memento_Iterator.iterator.Solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.*;

public class HarryPotterReader implements Iterator<String>, Iterable<String> {
    private List<String> harryPotterCharacters;
    int index = 0;

    public HarryPotterReader() {
        harryPotterCharacters = new ArrayList<>();
        try {
            File myObj = new File("src/com/muwaffaq/innopolis/lab12/iterator/harryPotter.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                harryPotterCharacters.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    @Override
    public boolean hasNext() {
        return index < harryPotterCharacters.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String text = harryPotterCharacters.get(index);
        index++;
        return text;
    }


    @Override
    public Iterator<String> iterator() {
        return new HarryPotterReader();
    }
}
