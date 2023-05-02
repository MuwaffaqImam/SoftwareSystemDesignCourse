package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones.problem;

import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones.LightningPort;

public class iPhone implements LightningPort {

    @Override
    public void chargeByLightning() {
        System.out.println("Charging with Lightning");
    }
}
