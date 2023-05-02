package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Builder.Problem;

public class Main {

    public static void main(String[] args) {
            VideoGame game = VideoGame.builder()
                    .title("Eldin Ring")
                    .description("Best Game Ever")
                    .isPurchased(true)
                    .trailerUrl("hhhhhh")
                    .company("FromSfotware")
                    .build();
    }
}
