package com.muwaffaq.innopolis.lab11.composite;

import java.util.ArrayList;
import java.util.List;

public class PalletComposite extends ProductComponent {

    String palletName;

    List<ProductComponent> productComponentList;

    public PalletComposite(String palletName) {
        this.palletName = palletName;
        productComponentList = new ArrayList<>();
    }

    void add(ProductComponent productComponent) {
        productComponentList.add(productComponent);
    }

    void remove(ProductComponent productComponent) {
        productComponentList.remove(productComponent);
    }

    void get(int index) {
        productComponentList.get(index);
    }


    @Override
    void displayInfo() {
        System.out.print("this is Pallet: " + palletName);
        System.out.println(" Contains the Following:  ");
        for (ProductComponent productComponent : productComponentList) {
            productComponent.displayInfo();

        }
    }
}
