package com.muwaffaq.innopolis.lab11.adapter.adapter2;


import com.muwaffaq.innopolis.lab11.adapter.adapter2.solution.AdapterClass;

public class MainAdapter {

    public static void main(String[] args) {
        // write your code here
        iPhone iPhone = new iPhone();
        Android android = new Android();
        ChargerStation station = new ChargerStation();
        station.chargeByLightning(iPhone);
//        station.chargeByLightning(android); //--> error


    }
}
