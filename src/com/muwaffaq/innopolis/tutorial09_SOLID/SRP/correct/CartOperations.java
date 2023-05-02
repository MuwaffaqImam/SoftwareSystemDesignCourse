package com.muwaffaq.innopolis.tutorial09_SOLID.SRP.correct;


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
