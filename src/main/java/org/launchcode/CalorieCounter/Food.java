package org.launchcode.CalorieCounter;

public class Food extends FoodStuff {
    FoodType foodType;
    Food(String name, double quantity, double calories) {

    }
    Food(String name, double quantity, FoodType foodType) {
        super(name, quantity);
        this.foodType = foodType;
    }

    @Override
    public double getCalories() {
        return getQuantityInGrams() * foodType.getCaloriesPerGram();
    }

    @Override
    public double getProtein() {
        return getQuantityInGrams() * foodType.getProteinPerGram();
    }

    @Override
    public double getFiber() {
        return getQuantityInGrams() * foodType.getFiberPerGram();
    }

    @Override
    public double getFat() {
        return getQuantityInGrams() * foodType.getFatPerGram();
    }

    @Override
    public double getSugar() {
        return getQuantityInGrams() * foodType.getSugarPerGram();
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }
}
