package com.muwaffaq.innopolis.lab11.composite;

public abstract class ProductComponent {
    String productName;
    String productPrice;

    public ProductComponent() {
    }

    public ProductComponent(String productName, String productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    abstract void displayInfo();


}