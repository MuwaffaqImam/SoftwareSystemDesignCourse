package com.muwaffaq.innopolis.adapter.phones;

public class iPhone implements LightningPort {

    @Override
    public void chargeByLightning() {
        System.out.println("charging by lightning");
    }
}
