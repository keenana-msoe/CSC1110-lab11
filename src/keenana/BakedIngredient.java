/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Lab 11 - Interfaces
 * Name: Andrew Keenan
 * Created: 11-7-23
 */
package keenana;

/**
 * the class for baking the ingredient
 */
public class BakedIngredient implements Ingredient {
    private final Ingredient baseIngredient;
    private final double expansionFactor;

    /**
     * basic constructor
     * @param ingredient the ingredient you want to bake
     * @param expansionFactor how much the ingredient will expand
     */
    public BakedIngredient(Ingredient ingredient, double expansionFactor){
        this.baseIngredient = ingredient;
        this.expansionFactor = expansionFactor;
    }
    @Override
    public double getCalories() {
        return baseIngredient.getCalories();
    }

    @Override
    public double getCups() {
        return expansionFactor * baseIngredient.getCups();
    }

    @Override
    public String getName() {
        return "Baked "+baseIngredient.getName();
    }

    @Override
    public boolean isDry() {
        return true;
    }

    @Override
    public void printRecipe() {
        int energy = (int)getCalories();
        System.out.println("====================================================");
        System.out.println(getName());
        System.out.println("====================================================");
        System.out.println("Ingredient to be baked: "+baseIngredient.getName());
        System.out.println("Cups: "+CUP_FORMAT.format(getCups())+" cups");
        System.out.println("Energy: "+energy+" Calories");
        System.out.println();
        baseIngredient.printRecipe();
    }
}