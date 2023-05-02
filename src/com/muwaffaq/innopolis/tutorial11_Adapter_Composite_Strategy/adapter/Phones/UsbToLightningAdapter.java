package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones;


//
public class UsbToLightningAdapter implements LightningPort {
    UsbPort usbPort;

    public UsbToLightningAdapter(UsbPort usbPort) {
        this.usbPort = usbPort;
    }

    @Override
    public void chargeByLightning() {
        usbPort.chargeByUsb();
    }
}
