package com.muwaffaq.innopolis.lab10.singleton.Reader.Solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TransitionWords {
    private List<String> dataCollection;
    static TransitionWords instance;


    private TransitionWords() {
        dataCollection = new ArrayList<String>();
        readFile();
    }

    public static TransitionWords getInstance() {
        if (instance == null)
            instance = new TransitionWords();
        return instance;
    }

    private void readFile() {
        try {
            Thread.sleep(3000);
            File myObj = new File("src/com/muwaffaq/innopolis/lab10/singleton/Reader/transitions.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                dataCollection.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException | InterruptedException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public String getRandomTransition() {
        //Equation to find Random number between range [minValue,maxValue]
        // minValue + rn.nextInt(maxValue - minValue + 1)
        Random rn = new Random();
        return dataCollection.get(rn.nextInt(dataCollection.size() - 1));
    }


}




