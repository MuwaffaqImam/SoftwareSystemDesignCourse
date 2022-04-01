package com.muwaffaq.innopolis.lab09.SRP.wrong;
import com.muwaffaq.innopolis.lab09.SRP.correct.Product;

import java.util.List;

/**
 * ❌ ❌ ❌ ❌
 * how many responsibilities does it have?
 *
 * SRP :
 * a class should only have one responsibility
 * it should only have one reason to change
 */

public class Cart {

    List<Product> products;
    double totals;
    String token;

    // -- cart operation
    void addToCart(Product product) {
        products.add(product);
    }
    void removeFromCart(Product product) {
        products.remove(product);
    }
    // discount manager
    void applyDiscount(int percentage) {
        totals = totals * percentage;
    }

}



