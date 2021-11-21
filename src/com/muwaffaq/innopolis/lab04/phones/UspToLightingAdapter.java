package com.muwaffaq.innopolis.lab04.phones;

public class UspToLightingAdapter implements LightningPort  {

    private UspPort uspPort;

    public UspToLightingAdapter(UspPort uspPort) {
        this.uspPort = uspPort;
    }

    @Override
    public void chargeByLightning() {
        uspPort.chargeByUsp();
    }
}
