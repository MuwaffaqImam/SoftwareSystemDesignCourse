package com.muwaffaq.innopolis.lab11.adapter.adapter2.solution;

import com.muwaffaq.innopolis.lab11.adapter.adapter2.LightningPort;
import com.muwaffaq.innopolis.lab11.adapter.adapter2.UsbPort;

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
