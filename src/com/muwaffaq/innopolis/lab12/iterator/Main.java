package com.muwaffaq.innopolis.lab12.iterator;


public class Main {
    public static void main(String[] args) {
        Iterator<String> iterator = new Reader();
        System.out.println("Lets iterate over our Object");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
