package org.launchcode.CalorieCounter;

public class Ingredient implements CalorieConversion {
    private String name;
    private double quantityInOunces;
    private double quantityInGrams;
    private double caloriesPerOunce;
    private double caloriesPerGram;
    private double proteinPerGram;
    private double sugarPerGram;
    private double fatPerGram;
    private double fiberPerGram;

    public Ingredient(String name, double quantity, String quantityType, double calories) {
        this.name = name;
        if (quantityType.equals("g")) {
            this.quantityInGrams = quantity;
            this.quantityInOunces = CalorieConversion.convertGramsToOunces(quantity);
        } else if (quantityType.equals("oz")) {
            this.quantityInOunces = quantity;
            this.quantityInGrams = CalorieConversion.convertOuncesToGrams(quantity);
        }
        this.caloriesPerGram = calories/quantityInGrams;
        this.caloriesPerOunce = calories/quantityInOunces;
    }
    public Ingredient(String name, double quantity, String quantityType, double calories, double protein, double sugar, double fat, double fiber) {
        this(name, quantity, quantityType, calories);
        this.proteinPerGram = protein/quantityInGrams;
        this.sugarPerGram = sugar/quantityInGrams;
        this.fiberPerGram = fiber/quantityInGrams;
        this.fatPerGram = fat/quantityInGrams;
    }

    @Override
    public double getCaloriesPerGram() {
        return quantityInGrams*caloriesPerGram;
    }

    @Override
    public double getCaloriesPerOunce() {
        return quantityInOunces*caloriesPerOunce;
    }

    public String getName() {
        return name;
    }

    public double getQuantityInOunces() {
        return quantityInOunces;
    }

    public double getQuantityInGrams() {
        return quantityInGrams;
    }

    public double getProteinPerGram() {
        return proteinPerGram;
    }

    public double getSugarPerGram() {
        return sugarPerGram;
    }

    public double getFatPerGram() {
        return fatPerGram;
    }

    public double getFiberPerGram() {
        return fiberPerGram;
    }
}
