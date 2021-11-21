package com.muwaffaq.innopolis.adapter.phones;

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
