package com.muwaffaq.innopolis.lab11.adapter.adapter2;


public class MainAdapter {

    public static void main(String[] args) {
        // write your code here
        iPhone iPhone = new iPhone();
        Android android = new Android();
        ChargerStation station = new ChargerStation();
        station.chargeByLightning(iPhone);
        station.chargeByLightning(new AdapterClass(android));


    }
}
