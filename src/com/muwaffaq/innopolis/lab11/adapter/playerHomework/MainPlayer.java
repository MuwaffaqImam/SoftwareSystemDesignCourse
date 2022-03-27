package com.muwaffaq.innopolis.lab11.adapter.playerHomework;

import com.muwaffaq.innopolis.lab11.adapter.phones.Mp3ToMp4Adapter;

public class MainPlayer {

    public static void main(String[] args) {
//         create a classes and implement Audio player and Media player
//         try to play mp3 using mp4 ( create an adapter to handle it)
        Audio audio = new Audio();
        Media media = new Media();
        PlayerDevice playerDevice = new PlayerDevice();
        playerDevice.playMb4(media);
        playerDevice.playMb4(new Mp3ToMp4Adapter(audio));
    }
}
