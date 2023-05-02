package com.muwaffaq.innopolis.tutorial13_Bridge_Memento_Iterator.iterator.Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Try to read all the character form the file.
 * hide the implementation and how you are reading the characters by use Iterator interface
 * -- Also make the class Reader itself iterate by a foreach loop
 */
public class ReaderProblem {


    private static ArrayList<String> harryPotterCharacters;

    public static void main(String[] args) {
        harryPotterCharacters = new ArrayList<>();
        try {
            File myObj = new File("src/com/muwaffaq/innopolis/tutorial13_Bridge_Memento_Flyweight/iterator/harryPotter.txt");
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

        for (String x : harryPotterCharacters) {
            System.out.println(x);
        }
    }


}
