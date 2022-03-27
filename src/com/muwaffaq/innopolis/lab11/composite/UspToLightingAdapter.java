package com.muwaffaq.innopolis.lab11.composite;

import com.muwaffaq.innopolis.lab11.adapter.phones.LightningPort;
import com.muwaffaq.innopolis.lab11.adapter.phones.UspPort;

public class UspToLightingAdapter implements LightningPort {

    private UspPort uspPort;

    public UspToLightingAdapter(UspPort uspPort) {
        this.uspPort = uspPort;
    }

    @Override
    public void chargeByLightning() {
        uspPort.chargeByUsp();
    }
}
