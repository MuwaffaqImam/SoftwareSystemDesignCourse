package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.composite.Solution;

import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.composite.ProductComponent;

import java.util.ArrayList;
import java.util.List;

public class PalletComposite extends ProductComponent {

    String palletName;
    double totalprice = 0;
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
   public double displayInfo() {
        System.out.print("this is Pallet: " + palletName);
        System.out.println(" Contains the Following:  ");
        for (ProductComponent productComponent : productComponentList) {
            totalprice+= productComponent.displayInfo();
        }
        System.out.println("total price in "+palletName+" pallet " + totalprice);
        return totalprice;
    }
}
