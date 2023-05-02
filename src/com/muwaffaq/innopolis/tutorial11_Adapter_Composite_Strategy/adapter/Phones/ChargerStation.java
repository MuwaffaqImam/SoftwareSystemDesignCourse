package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones;

public class ChargerStation {

    // UsbPort & LightningPort
    // Implement the one you need (LightningPort) and the other (UsbPort) send it to the Constructor
    void chargeByLightning(LightningPort lightningPort) {
        System.out.println("Charging by lightning in the station");
        lightningPort.chargeByLightning();
    }
}
