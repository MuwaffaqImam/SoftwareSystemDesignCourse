package com.muwaffaq.innopolis.lab11.adapter.adapter2;

public class AdapterClass implements LightningPort {


    UsbPort usbPort;

    public AdapterClass(UsbPort usbPort) {
        this.usbPort = usbPort;
    }

    @Override
    public void chargeByLightning() {
       usbPort.chargeByUsp();
    }
}
