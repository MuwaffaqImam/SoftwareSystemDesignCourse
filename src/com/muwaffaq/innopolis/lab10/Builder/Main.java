package com.muwaffaq.innopolis.lab10.Builder;

public class Main {


    public static void main(String[] args) {
        VideoGame videoGame = new VideoGame
                .VideoGameBuilder("Eldin Ring")
                .company("FromSoftware")
                .description("This game created by Hidetaka Miyazaki and George R.R. Martin and now it became the most popular game ever it sold 12 million copies in less than one month")
                .isPurchased(false)
                .price(70)
                .publisher("Bandai Namco")
                .releaseDate("25.02.2022")
                .trailerUrl("https://youtu.be/K_03kFqWfqs")
                .build();
        System.out.println(videoGame.toString());

    }

}
