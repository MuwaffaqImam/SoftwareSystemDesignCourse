package com.muwaffaq.innopolis.lab04.phones;

public class iPhone implements LightningPort {

    @Override
    public void chargeByLightning() {
        System.out.println("charging by lightning");
    }
}
