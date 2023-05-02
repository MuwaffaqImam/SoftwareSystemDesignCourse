package com.muwaffaq.innopolis.tutorial15_chain_command_template.Template.Problem;

public class Pasta extends Recipe{


    @Override
    void prepareIngredients() {
        System.out.println("Pasta ingredients");
    }

    @Override
    void cook() {
        System.out.println("Cook Pasta");
    }
}
