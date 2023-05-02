package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones.solution;

public class Android  implements UsbPort {
    @Override
    public void chargeByUsb() {
        System.out.println("Charging by Usb");
    }
}
