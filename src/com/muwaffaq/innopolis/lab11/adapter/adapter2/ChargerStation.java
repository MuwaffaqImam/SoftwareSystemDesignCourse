package com.muwaffaq.innopolis.lab11.adapter.adapter2;

public class ChargerStation {

    // UsbPort & LightningPort
    // Implement the one you need (lightningPort) and the other (UspPort) send it to the Constructor
    void chargeByLightning(LightningPort lightningPort) {
        System.out.println("Charging by lightning in the station");
        lightningPort.chargeByLightning();
    }
}
