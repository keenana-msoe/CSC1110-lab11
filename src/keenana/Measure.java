/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Lab 11 - Interfaces
 * Name: Andrew Keenan
 * Created: 11-7-23
 */
package keenana;

/**
 * the measure class to measure ingredients
 */
public class Measure implements Ingredient {
    private final Ingredient baseIngredient;
    private final int numerator;
    private final int denominator;

    /**
     * constructor with a denominator
     * @param numerator numerator for the measured factor
     * @param denominator denominator for the measured fctor
     * @param ingredient ingredient passed in
     */
    public Measure(int numerator, int denominator, Ingredient ingredient){
        this.numerator = numerator;
        this.denominator = denominator;
        this.baseIngredient = ingredient;
    }

    /**
     * constructor without a denominator
     * @param numerator numerator for the measured factor
     * @param ingredient ingredient passed in
     */
    public Measure(int numerator, Ingredient ingredient){
        this.numerator = numerator;
        this.denominator = 1;
        this.baseIngredient = ingredient;
    }
    @Override
    public double getCalories() {
        return ((double) numerator / denominator) *(baseIngredient.getCalories() /
                baseIngredient.getCups());
    }

    @Override
    public double getCups() {
        return (double) numerator / denominator;
    }

    @Override
    public String getName() {
        if (denominator == 1){
            return numerator+" cups "+ baseIngredient.getName();
        } else {
            return numerator+"/"+denominator+" cups "+baseIngredient.getName();
        }
    }

    @Override
    public boolean isDry() {
        return baseIngredient.isDry();
    }

    @Override
    public void printRecipe() {
        int energy = (int)Math.round(getCalories());
        System.out.println("====================================================");
        System.out.println(getName());
        System.out.println("====================================================");
        System.out.println("Measured Ingredient: "+baseIngredient.getName());
        System.out.println("Quantity: "+formatQuantity());
        System.out.println("Energy: "+energy+" Calories");
        System.out.println();
        baseIngredient.printRecipe();
    }
    private String formatQuantity(){
        if (denominator == 1){
            return numerator+" Cups ("+(int)getCups()+" Cups)";
        } else {
            return numerator+"/"+denominator+" Cups ("+CUP_FORMAT.format(getCups())+" Cups)";
        }
    }
}