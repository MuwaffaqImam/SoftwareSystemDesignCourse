package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.composite.Problem;

import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.composite.ProductComponent;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Let's say that we have a sotre, in this store we have a Box and product.
    // Now every box can contain another box or one or more Products.
    // One day the Manger Said to us:
    // I want you to write for me all the information in all boxes and tell me how much price dose every box have.

       public static void main() {
            List<ProductComponent> ElectronicsBox = new ArrayList<>();
            ElectronicsBox.add(new Product("headset",300));
            ElectronicsBox.add(new Product("Phone",300));

            List<ProductComponent> menClothesBox = new ArrayList<>();
            ElectronicsBox.add(new Product("T-shirt",3));
            ElectronicsBox.add(new Product("Trouser",8));
            double totalPrice = 0;
            for (ProductComponent b1 : ElectronicsBox) {
                System.out.println(b1.productName);
                totalPrice += b1.productPrice;
            }
            for (ProductComponent b1 : menClothesBox) {
                System.out.println(b1.productName);
                totalPrice += b1.productPrice;
            }

            System.out.println("total price is");
            System.out.println(totalPrice);

        }




    //region Spoiler
    // our Manger is a technical Geek he looked at the code and said WTF is that?
    // I don't want you to implement the code in this childish way
    // and display everything in all boxes using one Function call, or you are fired.
    // The tale of our developer with suffering and endurance has just begun
    //endregion
}
