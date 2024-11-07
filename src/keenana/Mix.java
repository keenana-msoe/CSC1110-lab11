/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Lab 11 - Interfaces
 * Name: Andrew Keenan
 * Created: 11-7-23
 */
package keenana;

import java.util.ArrayList;

/**
 * mixes ingredients together
 */
public class Mix implements Ingredient {
    private final ArrayList<Ingredient> ingredients;
    private final String name;

    /**
     * public constructor
     * @param name name of the mixed ingredient
     */
    public Mix(String name){
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    /**
     * adds an ingredient to the arrayList
     * @param ingredient the ingredient you wish to add
     */
    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    /**
     * checks to see if it has a dry ingredient in the mix
     * @return true or false
     */
    public boolean hasDryIngredient(){
        boolean hasDry = false;
        for(int i = 0; i < ingredients.size(); i++){
            if(ingredients.get(i).isDry()){
                hasDry = true;
            }
        }
        return hasDry;
    }

    /**
     * checks to see if it has awet ingredient in the mix
     * @return true or false
     */
    public boolean hasWetIngredient(){
        boolean hasWet = false;
        for(int i = 0; i < ingredients.size(); i++){
            if(!ingredients.get(i).isDry()){
                hasWet = true;
            }
        }
        return hasWet;
    }
    @Override
    public double getCalories() {
        double calories = 0;
        for (int i = 0; i < ingredients.size(); i++){
            calories += ingredients.get(i).getCalories();
        }
        return Math.round(calories);
    }

    @Override
    public double getCups() {
        double cups = 0;
        for (int i = 0; i < ingredients.size(); i++){
            cups += ingredients.get(i).getCups();
        }
        return cups;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isDry() {
        return !hasWetIngredient();
    }

    @Override
    public void printRecipe() {
        ArrayList<Ingredient> dry = new ArrayList<>();
        ArrayList<Ingredient> wet = new ArrayList<>();
        for (int i = 0; i < ingredients.size(); i++){
            if(ingredients.get(i).isDry()){
                dry.add(ingredients.get(i));
            } else {
                wet.add(ingredients.get(i));
            }
        }
        int energy = (int)getCalories();
        System.out.println("====================================================");
        System.out.println(getName());
        System.out.println("====================================================");
        System.out.println("Dry Ingredients: ");
        for (int i = 0; i < dry.size(); i++){
            System.out.println("  "+dry.get(i).getName());
        }
        System.out.println("Wet Ingredients: ");
        for (int i = 0; i < wet.size(); i++){
            System.out.println("  "+wet.get(i).getName());
        }
        System.out.println("Cups: "+CUP_FORMAT.format(getCups())+" cups");
        System.out.println("Energy "+energy+" Calories");
        for (int i = 0; i < ingredients.size(); i++){
            System.out.println();
            ingredients.get(i).printRecipe();
        }
    }
}