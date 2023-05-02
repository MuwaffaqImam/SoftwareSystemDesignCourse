package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones;


import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones.problem.Android;
import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.Phones.problem.iPhone;

public class MainAdapter {

    public static void main(String[] args) {
        // write your code here
        Android android = new Android();
        iPhone phone = new iPhone();
        ChargerStation station = new ChargerStation();
        station.chargeByLightning(phone);
        UsbToLightningAdapter adapter = new UsbToLightningAdapter(android);
        station.chargeByLightning(adapter);



    }
}
