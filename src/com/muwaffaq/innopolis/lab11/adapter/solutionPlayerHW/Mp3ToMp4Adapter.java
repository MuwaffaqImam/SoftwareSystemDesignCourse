package com.muwaffaq.innopolis.lab11.adapter.solutionPlayerHW;

import com.muwaffaq.innopolis.lab11.adapter.playerHomework.AudioPlayer;
import com.muwaffaq.innopolis.lab11.adapter.playerHomework.MediaPlayer;

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
