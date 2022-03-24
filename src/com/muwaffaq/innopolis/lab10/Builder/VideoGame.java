package com.muwaffaq.innopolis.lab10.Builder;

public class VideoGame {
    private String title;
    private String publisher;
    private String description;
    private String company;
    private String releaseDate;
    private String trailerUrl;
    private double price;
    private boolean isPurchased;

    private VideoGame(){ }

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


    public static class VideoGameBuilder {
        private final String title;
        private String publisher;
        private String description;
        private String company;
        private String releaseDate;
        private String trailerUrl;
        private double price;
        private boolean isPurchased;


        public VideoGameBuilder(String title) {
            this.title = title;
        }

        public VideoGameBuilder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }


        public VideoGameBuilder description(String description) {
            this.description = description;
            return this;
        }


        public VideoGameBuilder company(String company) {
            this.company = company;
            return this;
        }


        public VideoGameBuilder releaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }


        public VideoGameBuilder trailerUrl(String trailerUrl) {
            this.trailerUrl = trailerUrl;
            return this;
        }


        public VideoGameBuilder price(double price) {
            this.price = price;
            return this;
        }


        public VideoGameBuilder isPurchased(boolean isPurchased) {
            this.isPurchased = isPurchased;
            return this;
        }

        public VideoGame build() {
            VideoGame videoGame = new VideoGame();
            videoGame.title = this.title;
            videoGame.publisher = this.publisher;
            videoGame.description = this.description;
            videoGame.company = this.company;
            videoGame.releaseDate = this.releaseDate;
            videoGame.trailerUrl = this.trailerUrl;
            videoGame.price = this.price;
            videoGame.isPurchased = this.isPurchased;
            return videoGame;
        }
    }
}
