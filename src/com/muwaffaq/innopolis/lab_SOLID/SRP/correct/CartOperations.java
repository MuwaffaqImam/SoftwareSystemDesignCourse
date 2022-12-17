package com.muwaffaq.innopolis.lab_SOLID.SRP.correct;


import java.util.List;

public class CartOperations {

    private List<Product> products;

    public CartOperations(List<Product> products) {
        this.products = products;
    }

    void addToCart(Product product) {
        products.add(product);
    }

    void removeFromCart(Product product) {
        products.remove(product);
    }

}
