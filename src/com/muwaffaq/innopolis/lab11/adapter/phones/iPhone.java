package com.muwaffaq.innopolis.lab11.adapter.phones;

public class iPhone implements LightningPort {

    @Override
    public void chargeByLightning() {
        System.out.println("charging by lightning");
    }
}
