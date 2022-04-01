package com.muwaffaq.innopolis.lab10.builder2;

public class VideoGame {
    private String title;
    private String publisher;
    private String description;
    private String company;
    private String releaseDate;
    private String trailerUrl;
    private double price;
    private boolean isPurchased;

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", description='" + description + '\'' +
                ", company='" + company + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", trailerUrl='" + trailerUrl + '\'' +
                ", price=" + price +
                ", isPurchased=" + isPurchased +
                '}';
    }

    private VideoGame() {
    }

    static class VideoGameBuilder {
        VideoGame game;

        public VideoGameBuilder(String title) {
            game = new VideoGame();
            game.title = title;
        }

        public VideoGameBuilder publisher(String x) {
            game.publisher = x;
            return this;
        }

        public VideoGameBuilder description(String x) {
            game.description = x;
            return this;
        }

        public VideoGame build() {
            return game;
        }

    }
}
