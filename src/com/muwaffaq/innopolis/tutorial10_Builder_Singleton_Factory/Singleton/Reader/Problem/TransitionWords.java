package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Singleton.Reader.Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TransitionWords {
    private List<String> dataCollection;
    // expensive object
    public TransitionWords() {
        dataCollection = new ArrayList<String>();
        readFile();
    }

    private void readFile() {
        // a long process
        try {
            Thread.sleep(3000);
            File myObj = new File("src/com/muwaffaq/innopolis/lab10_Builder_Singleton_Factory/Singleton/Reader/transitions.txt");
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




