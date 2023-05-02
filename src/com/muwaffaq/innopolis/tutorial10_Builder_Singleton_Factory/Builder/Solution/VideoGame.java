package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Builder.Solution;


/**
 Create a nested Builder class inside the VideoGame class.
 This class will be responsible for constructing the VideoGame object.
 *
 */
public class VideoGame {
    private String title;
    private String publisher;
    private String description;
    private String company;
    private String releaseDate;
    private String trailerUrl;
    private double price;
    private boolean isPurchased;

    public static class Builder {
        private String title;
        private String publisher;
        private String description;
        private String company;
        private String releaseDate;
        private String trailerUrl;
        private double price;
        private boolean isPurchased;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder setTrailerUrl(String trailerUrl) {
            this.trailerUrl = trailerUrl;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setIsPurchased(boolean isPurchased) {
            this.isPurchased = isPurchased;
            return this;
        }
        public VideoGame build() {
            VideoGame game = new VideoGame();
            game.title = this.title;
            game.publisher = this.publisher;
            game.description = this.description;
            game.company = this.company;
            game.releaseDate = this.releaseDate;
            game.trailerUrl = this.trailerUrl;
            game.price = this.price;
            game.isPurchased = this.isPurchased;
            return game;
        }

    }
    public static Builder builder() {
        return new Builder();
    }

    public static void main(String[] args) {
        VideoGame game = VideoGame.builder()
                .setTitle("Eldin Ring")
                .setPublisher("Bandai Namco")
                .setDescription("The best open world game ever")
                .setCompany("Fromsfotware")
                .setReleaseDate("February 25, 2022")
                .setTrailerUrl("https://youtu.be/E3Huy2cdih0")
                .setPrice(59.99)
                .setIsPurchased(true)
                .build();
    }

}

