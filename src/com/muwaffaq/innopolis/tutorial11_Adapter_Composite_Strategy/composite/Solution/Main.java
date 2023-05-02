package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.composite.Solution;

public class Main {


    public static void main(String[] args) {

        PalletComposite store = new PalletComposite("Store");

        PalletComposite electronic = new PalletComposite("Electronics");
        electronic.add(new Product("Charger", 13));
        electronic.add(new Product("Headset", 20));

        PalletComposite clothes = new PalletComposite("Clothes");

        PalletComposite menClothes = new PalletComposite("Men Clothes");
        menClothes.add(new Product("Trouser", 5));
        menClothes.add(new Product("T-shirt", 3));


        PalletComposite womenClothes = new PalletComposite("Women Clothes");
        womenClothes.add(new Product("Dress", 500));
        womenClothes.add(new Product("Skirt", 300));

        clothes.add(womenClothes);
        clothes.add(menClothes);

        store.add(electronic);
        store.add(clothes);

        store.displayInfo();

    }

}
