package com.muwaffaq.innopolis.lab12.iterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Consumer;

public class Reader implements Iterator<String> {
    private List<String> harryPotterCharacters;
    int index = 0;

    public Reader() {
        harryPotterCharacters = new ArrayList<>();
        try {
            File myObj = new File("/Users/moofiy/Moofiy/InnoLocal/Softwaer System design Course/SoftwareSystemDesignCourse/src/com/muwaffaq/innopolis/lab12/iterator/harryPotter.txt");
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

}
