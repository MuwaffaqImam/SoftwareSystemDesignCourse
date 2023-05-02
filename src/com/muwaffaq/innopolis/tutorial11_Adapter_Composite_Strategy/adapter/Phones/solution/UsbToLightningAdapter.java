package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones.solution;
import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones.LightningPort;
import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones.UsbPort;

// Implement the one you need (LightningPort)
// and the other (UsbPort) send it to the Constructor
public class UsbToLightningAdapter implements LightningPort {
    UsbPort usbPort;

    public UsbToLightningAdapter(UsbPort usbPort){
        this.usbPort = usbPort;
    }

    @Override
    public void chargeByLightning() {
        usbPort.chargeByUsb();
    }
}
