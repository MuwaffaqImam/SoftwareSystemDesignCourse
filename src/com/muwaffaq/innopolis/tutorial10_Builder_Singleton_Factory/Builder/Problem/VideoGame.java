package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Builder.Problem;

/**
 * Builder Design pattern
 * ToDO: 1. Create a nested Builder class inside the VideoGame class. This class will be responsible for constructing the VideoGame object.
 * ToDO: 2. Inside the Builder class, create a set of methods to set each field of the VideoGame object.
 * ToDO: 3. In the Builder class, create a method that returns a new VideoGame object using the values set by the Builder methods
 * ToDO: 4. In the VideoGame class, create a static method that returns a new Builder object.
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

    public VideoGame() {}


    public static class Builder {
        private String title;
        private String publisher;
        private String description;
        private String company;
        private String releaseDate;
        private String trailerUrl;
        private double price;
        private boolean isPurchased;

        Builder title(String title){
            this.title = title;
            return this;
        }
        Builder publisher(String publisher){
            this.publisher=publisher;
            return this;
        }

        Builder description(String x){
            this.description =x ;
            return this;
        }
        Builder company(String x){
            this.company =x ;
            return this;
        }
        Builder releaseDate(String x){
            this.releaseDate = x;
            return this;
        }
        Builder trailerUrl(String x){
            this.trailerUrl =x ;
            return this;
        }
        Builder price(double x){
            this.price = x;
            return this;
        }
        Builder  isPurchased(boolean x){
            this.isPurchased =x ;
            return this;
        }

        VideoGame build(){
            VideoGame game = new VideoGame();
            game.title=this.title;
            game.isPurchased = isPurchased;
            game.price=price;
            game.company = company;
            game.releaseDate = releaseDate;
            game.description = description;
            game.publisher = publisher;
            game.trailerUrl = trailerUrl;
            return game;
        }

    }

    public static Builder builder() {
        return new Builder();
    }


}
