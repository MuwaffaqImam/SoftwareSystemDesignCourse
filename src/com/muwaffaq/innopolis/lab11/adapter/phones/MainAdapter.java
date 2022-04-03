package com.muwaffaq.innopolis.lab11.adapter.phones;

import com.muwaffaq.innopolis.lab11.adapter.UspToLightingAdapter;

public class MainAdapter {

    public static void main(String[] args) {
        // write your code here
        ChargerStation station = new ChargerStation();
        iPhone iPhone = new iPhone();
        station.chargeByLightning(iPhone);
        // focus here
        Android android = new Android();
        UspToLightingAdapter adapter = new UspToLightingAdapter(android);
        station.chargeByLightning(adapter);

    }
}
