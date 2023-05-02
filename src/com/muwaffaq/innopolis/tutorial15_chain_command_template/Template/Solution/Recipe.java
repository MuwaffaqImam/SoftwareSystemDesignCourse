package com.muwaffaq.innopolis.tutorial15_chain_command_template.Template.Solution;

abstract public class Recipe {

    /**
     * This iis the template method that already tell the class what to do in order.
     */
    public final void cookRecipeTemplate() {
        prepareIngredient();
        cook();
        serve();
    }

    public void cook() {
        System.out.println("Cook main recipe");
    }

    public void prepareIngredient() {
        System.out.println("Prepare Ingredient");
    }

    public void serve() {
        System.out.println("Serve the hot dish");
    }


}
