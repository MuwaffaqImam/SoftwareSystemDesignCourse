package com.muwaffaq.innopolis.tutorial15_chain_command_template.Template.Problem;

public class Pizza extends Recipe{
    @Override
    void prepareIngredients() {
        System.out.println("Adding Pizza Toppings");
    }

    @Override
    void cook() {
        System.out.println("Cook Pizza in the oven");
    }

    @Override
    void serve() {
        System.out.println("Serve in a box");
    }
}
