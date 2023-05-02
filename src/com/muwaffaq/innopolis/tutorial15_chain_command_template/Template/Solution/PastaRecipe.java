package com.muwaffaq.innopolis.tutorial15_chain_command_template.Template.Solution;

public class PastaRecipe extends Recipe{


    @Override
    public void cook() {
        System.out.println("Cooking the Pasta");
    }

    @Override
    public void prepareIngredient() {
        System.out.println("Prepare Pasta Noodles");
    }

    @Override
    public void serve() {
        System.out.println("Serving the pasta");

    }
}
