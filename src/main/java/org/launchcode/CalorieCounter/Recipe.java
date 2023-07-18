package org.launchcode.CalorieCounter;

import java.util.ArrayList;

public class Recipe extends FoodType {
    ArrayList<Food> ingredientList;
    double servingsPerRecipe;
    Recipe(String name, double servingsPerRecipe) {
        super(name, 0, "g", 0);

        this.ingredientList = new ArrayList<>();
    }

    public ArrayList<Food> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(ArrayList<Food> ingredientList) {
        this.ingredientList = ingredientList;
    }
    public void addIngredient(Food newIngredient) {
        ingredientList.add(newIngredient);
    }
    public void removeIngredient(Food ingredientToRemove) {
        ingredientList.remove(ingredientToRemove);
    }
    public void removeIngredient(int indexOfIngredient) {
        ingredientList.remove(indexOfIngredient);
    }
    public void clearIngredients() {
        ingredientList = new ArrayList<>();
    }
}
