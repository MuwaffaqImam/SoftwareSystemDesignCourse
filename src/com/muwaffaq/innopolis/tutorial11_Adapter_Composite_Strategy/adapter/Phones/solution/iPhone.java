package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones.solution;

public class iPhone implements LightningPort {
    @Override
    public void chargeByLightning() {
        System.out.println("Charging by Lightning");
    }
}
