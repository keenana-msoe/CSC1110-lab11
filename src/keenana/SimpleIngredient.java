/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Lab 11 - Interfaces
 * Name: Andrew Keenan
 * Created: 11-7-23
 */
package keenana;

/**
 * the class for the simple ingredients
 */
public class SimpleIngredient implements Ingredient {
    private final double calories;
    private final double cups;
    private final boolean isDry;
    private final String name;

    /**
     * basic constructor
     * @param calories calories of the ingredient
     * @param cups cups of the ingredient
     * @param isDry is the ingredient dry
     * @param name name of the ingredient
     */
    public SimpleIngredient(double calories, double cups, boolean isDry, String name){
        this.calories = calories;
        this.cups = cups;
        this.isDry = isDry;
        this.name = name;
    }
    public double getCalories() {
        return Math.round(this.calories);
    }
    public double getCups() {
        return cups;
    }
    public String getName() {
        return name;
    }
    public boolean isDry(){
        return isDry;
    }

    /**
     * prints the recipe
     */
    public void printRecipe(){
        int energy = (int)getCalories();
        System.out.println("====================================================");
        System.out.println(getName());
        System.out.println("====================================================");
        System.out.println("Cups: "+CUP_FORMAT.format(getCups())+" cups");
        System.out.println("Energy: "+energy+" Calories");
    }
}