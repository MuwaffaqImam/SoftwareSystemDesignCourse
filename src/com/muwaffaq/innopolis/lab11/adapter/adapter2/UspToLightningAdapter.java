package com.muwaffaq.innopolis.lab11.adapter.adapter2;


// Implement the one you need (lightningPort)
// and the other (UspPort) send it to the Constructor
public class UspToLightningAdapter implements LightningPort {
    private UsbPort uspPort;

    public UspToLightningAdapter(UsbPort uspPort) {
        this.uspPort = uspPort;
    }


    @Override
    public void chargeByLightning() {
        uspPort.chargeByUsp();
    }
}
