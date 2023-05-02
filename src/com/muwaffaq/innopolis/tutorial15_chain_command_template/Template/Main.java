package com.muwaffaq.innopolis.tutorial15_chain_command_template.Template;

import com.muwaffaq.innopolis.tutorial15_chain_command_template.Template.Solution.PastaRecipe;
import com.muwaffaq.innopolis.tutorial15_chain_command_template.Template.Solution.PizzaRecipe;
import com.muwaffaq.innopolis.tutorial15_chain_command_template.Template.Solution.Recipe;

public class Main {


    public static void main(String[] args) {
        Recipe pizza = new PizzaRecipe();
        pizza.cookRecipeTemplate();
        Recipe pasta = new PastaRecipe();
        pasta.cookRecipeTemplate();

    }
}
