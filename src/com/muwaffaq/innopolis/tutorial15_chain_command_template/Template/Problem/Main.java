package com.muwaffaq.innopolis.tutorial15_chain_command_template.Template.Problem;

public class Main {


    public static void main(String[] args) {
        Recipe pizza = new Pizza();
        Recipe pasta = new Pasta();
        pizza.templateRecipe();
        pasta.templateRecipe();
    }
}
