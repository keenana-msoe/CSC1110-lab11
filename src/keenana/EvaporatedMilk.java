/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Lab 11 - Interfaces
 * Name: Andrew Keenan
 * Created: 11-7-23
 */

package keenana;

/**
 * Driver class that illustrates making evaporated milk by baking milk.
 */
public class EvaporatedMilk {
    /** The milk to be baked */
    //private static final Ingredient MILK =
    //        new SimpleIngredient("Milk", 103.0, 1.0, false);
    private static final Ingredient MILK =
            new SimpleIngredient(103, 1, false, "Milk");
    /** Ratio of volume after evaporating to before */
    public static final double DEHYDRATION_FACTOR = 0.2;

    public static void main(String[] args) {
        Ingredient milk = MILK;
        milk.printRecipe();

        Ingredient evaporatedMilk = new BakedIngredient(milk, DEHYDRATION_FACTOR);
        evaporatedMilk.printRecipe();
    }
}
