/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Lab 11 - Interfaces
 * Name: Andrew Keenan
 * Created: 11-7-23
 */
package keenana;

import java.text.DecimalFormat;

/**
 * the interface of Ingredient
 */
public interface Ingredient {
    /**
     * it is the decimalFormat object that all of the ingredients need
     */
    public final DecimalFormat CUP_FORMAT = new DecimalFormat("#.##");

    /**
     * common method to get the number fo calories
     * @return the number of calories in a double
     */
    public abstract double getCalories();

    /**
     * method to get the number of cups
     * @return number of cups
     */
    public abstract double getCups();

    /**
     * method that retrieves the name of the ingredient
     * @return name as a String
     */
    public abstract String getName();

    /**
     * boolean to see if it is a dry ingredient
     * @return boolean if it is dry
     */
    public abstract boolean isDry();

    /**
     * prints the recipe in a strongly formatted way
     */
    public abstract void printRecipe();
}