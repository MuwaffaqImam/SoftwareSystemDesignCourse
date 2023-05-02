package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Builder.Solution.Solution2;

public class Main {


    public static void main(String[] args) {
        VideoGame videoGame = new VideoGame.VideoGameBuilder("Dark souls").publisher("Namco").description("very cool game").build();

    }
}
