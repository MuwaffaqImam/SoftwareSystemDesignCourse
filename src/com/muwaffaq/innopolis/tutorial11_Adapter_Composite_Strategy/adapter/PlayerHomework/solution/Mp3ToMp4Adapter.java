package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.PlayerHomework.solution;

import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.PlayerHomework.AudioPlayer;
import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.adapter.PlayerHomework.MediaPlayer;

public class Mp3ToMp4Adapter implements MediaPlayer {

    AudioPlayer audioPlayer;

    public Mp3ToMp4Adapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void playMb4() {
        audioPlayer.playMb3();
    }
}
