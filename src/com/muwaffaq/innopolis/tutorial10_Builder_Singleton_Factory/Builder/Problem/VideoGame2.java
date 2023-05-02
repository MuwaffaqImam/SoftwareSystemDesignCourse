package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Builder.Problem;

/**
 * Builder Design pattern
 * ToDO: 1. Create a nested Builder class inside the VideoGame class. This class will be responsible for constructing the VideoGame object.
 * ToDO: 2. Inside the Builder class, create a set of methods to set each field of the VideoGame object.
 * ToDO: 3. In the Builder class, create a method that returns a new VideoGame object using the values set by the Builder methods
 * ToDO: 4. In the VideoGame class, create a static method that returns a new Builder object.
 */
public class VideoGame2 {
    private String title;
    private String publisher;
    private String description;
    private String company;
    private String releaseDate;
    private String trailerUrl;
    private double price;
    private boolean isPurchased;

    public VideoGame2() {}

    public VideoGame2 setTitle(String title) {
        this.title = title;
        return this;
    }

    public VideoGame2 setPublisher(String publisher) {
        this.publisher = publisher;
        return this;

    }

    public VideoGame2 setDescription(String description) {
        this.description = description;
        return this;

    }

    public VideoGame2 setCompany(String company) {
        this.company = company;
        return this;

    }

    public VideoGame2 setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;

    }

    public VideoGame2 setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
        return this;

    }

    public VideoGame2 setPrice(double price) {
        this.price = price;
        return this;

    }

    public VideoGame2 setPurchased(boolean purchased) {
        isPurchased = purchased;
        return this;

    }
}
