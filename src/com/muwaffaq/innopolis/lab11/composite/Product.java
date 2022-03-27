package com.muwaffaq.innopolis.lab11.composite;

public class Product extends ProductComponent {


    public Product(String productName, String productPrice) {
        super(productName, productPrice);
    }

    @Override
    void displayInfo() {
        System.out.print(" -This is a Product: ");
        System.out.print(productName);
        System.out.print(" With Price: ");
        System.out.println(productPrice);
    }
}
