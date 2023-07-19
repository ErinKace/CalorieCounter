package org.launchcode.CalorieCounter;

public class Food extends FoodStuff {
    Ingredient ingredient;
    Food(String name, double quantity, double calories) {

    }
    Food(String name, double quantity, Ingredient ingredient) {
        super(name, quantity);
        this.ingredient = ingredient;
    }

    @Override
    public double getCalories() {
        return getQuantityInGrams() * ingredient.getCaloriesPerGram();
    }

    @Override
    public double getProtein() {
        return getQuantityInGrams() * ingredient.getProteinPerGram();
    }

    @Override
    public double getFiber() {
        return getQuantityInGrams() * ingredient.getFiberPerGram();
    }

    @Override
    public double getFat() {
        return getQuantityInGrams() * ingredient.getFatPerGram();
    }

    @Override
    public double getSugar() {
        return getQuantityInGrams() * ingredient.getSugarPerGram();
    }

    public Ingredient getFoodType() {
        return ingredient;
    }

    public void setFoodType(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
