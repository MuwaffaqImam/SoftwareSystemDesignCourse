package com.muwaffaq.innopolis.lab10.builder2;

public class Main {


    public static void main(String[] args) {
        VideoGame videoGame = new VideoGame.VideoGameBuilder("Dark souls").publisher("Namco").description("very cool game").build();

    }
}
