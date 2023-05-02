package com.muwaffaq.innopolis.tutorial15_chain_command_template.Template.Problem;

abstract public class Recipe {

    public final void templateRecipe(){
        prepareIngredients();
        cook();
        serve();
    }

    void prepareIngredients(){
        System.out.println("The Recipe prepare ingredients");
    }
    void cook(){
        System.out.println("Start Cooking");
    }

    void serve(){
        System.out.println("serve in a fancy plate");
    }


}
