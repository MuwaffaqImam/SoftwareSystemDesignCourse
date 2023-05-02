package com.muwaffaq.innopolis.tutorial13_Bridge_Memento_Iterator.iterator.Solution;


public class Main {
    public static void main(String[] args) {
        HarryPotterReader reader = new HarryPotterReader();
        System.out.println("Lets iterate over our Object");
        for (String item : reader) {
            System.out.println("Item");
            System.out.println(item);
        }

    }
}
