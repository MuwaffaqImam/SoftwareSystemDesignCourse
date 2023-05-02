package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.composite;

public abstract class ProductComponent {
   public String productName;
  public   double productPrice;

    public ProductComponent() {
    }

    public ProductComponent(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

   public abstract double displayInfo();


}