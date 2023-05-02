package com.muwaffaq.innopolis.tutorial15_chain_command_template.Template.Solution;

public class PizzaRecipe extends Recipe{


    @Override
    public void cook() {
        System.out.println("Cooking the Pizza");
    }

    @Override
    public void prepareIngredient() {
        System.out.println("Prepare Pizza toppings");
    }
}
