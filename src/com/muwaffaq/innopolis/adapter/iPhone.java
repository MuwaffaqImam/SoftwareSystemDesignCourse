package com.muwaffaq.innopolis.adapter;

public class iPhone implements LightningPort {

    @Override
    public void chargeByLightning() {
        System.out.println("charging by lightning");
    }
}
