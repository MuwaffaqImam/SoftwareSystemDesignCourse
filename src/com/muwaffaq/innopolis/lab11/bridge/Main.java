package com.muwaffaq.innopolis.lab11.bridge;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        CarWorkshop carWorkshop = new CarWorkshop("BMW");
        System.out.println("We Have New Car What do you Want us to do to " + carWorkshop.name);
        while (true) {
            System.out.println("Write A if you want to assemble");
            System.out.println("Write D if you want to Disassemble");
            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
            if (next.toUpperCase().equals("A")) {
                carWorkshop.setWorkshop(message -> System.out.println("we Should assembles it"));
                carWorkshop.startFiltering("not used string");
            } else if (next.toUpperCase().equals("D")) {
                carWorkshop.setWorkshop(message -> System.out.println("we Should disassembles it"));
                carWorkshop.startFiltering("");
            } else
                break;
        }
    }

}
