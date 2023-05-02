package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones.problem;

import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones.UsbPort;

public class Android implements UsbPort {

    @Override
    public void chargeByUsb() {
        System.out.println("Charging with Usp port");
    }
}
