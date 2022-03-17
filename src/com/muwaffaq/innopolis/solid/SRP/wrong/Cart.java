package com.muwaffaq.innopolis.solid.SRP.wrong;
import com.muwaffaq.innopolis.solid.SRP.correct.Product;

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

    void addToCart(Product product) {
        products.add(product);
    }

    void removeFromCart(Product product) {
        products.remove(product);
    }

    void applyDiscount(int percentage) {
        totals = totals * percentage;
    }


}



