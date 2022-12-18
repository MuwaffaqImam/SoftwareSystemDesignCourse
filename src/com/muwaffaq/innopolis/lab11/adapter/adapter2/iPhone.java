package com.muwaffaq.innopolis.lab11.adapter.adapter2;

public class iPhone implements LightningPort{
    @Override
    public void chargeByLightning() {
        System.out.println("Charging by Lightning");
    }
}
