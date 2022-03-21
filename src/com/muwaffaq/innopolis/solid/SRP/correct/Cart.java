package com.muwaffaq.innopolis.solid.SRP.correct;



import java.io.Serializable;
import java.util.List;


/**
 * ✅
 * Follows SRP : only presents a simple object!
 */
public class Cart implements Serializable {

    List<Product> products;
    double totals;
    String token;

    public List<Product> getProducts() {
        return products;
    }

    public double getTotals() {
        return totals;
    }
}

