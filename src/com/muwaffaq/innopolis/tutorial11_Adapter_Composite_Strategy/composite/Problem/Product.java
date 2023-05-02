package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.composite.Problem;
import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.composite.ProductComponent;

public class Product extends ProductComponent {

     final String productName;
     final double productPrice;

    public Product(String productName, double productPrice) {
        super(productName, productPrice);
        this.productName = productName;
        this.productPrice = productPrice;
    }
    @Override
   public double displayInfo() {
        System.out.print(" -This is a Product: ");
        System.out.print(productName);
        System.out.print(" With Price: ");
        System.out.println(productPrice);
        return productPrice;
    }
}
