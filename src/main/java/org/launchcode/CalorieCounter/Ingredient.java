package org.launchcode.CalorieCounter;

public class Ingredient {
    private String name;
    private String brandName = "Unknown";
    private String servingUnit;
    private double servingSize;
    private double gramsPerServing;
    private double quantityInGrams;
    private double caloriesPerGram;
    private double proteinPerGram=0;
    private double sugarPerGram=0;
    private double fatPerGram=0;
    private double fiberPerGram=0;
    private MeasurementConvertor measurementConvertor;

    public Ingredient(String name, double quantity, String quantityType, double calories) {
        this.name = name;
        this.measurementConvertor = new MeasurementConvertor();
        if (quantityType.equals("g")) {
            this.quantityInGrams = quantity;
        } else  {
            this.quantityInGrams = measurementConvertor.convertMeasurement(quantity,quantityType, "grams");
        }
        this.caloriesPerGram = calories/quantityInGrams;
    }
    public Ingredient(String name, double quantity, String quantityType, double calories, double protein, double sugar, double fat, double fiber) {
        this(name, quantity, quantityType, calories);
        this.proteinPerGram = protein/quantityInGrams;
        this.sugarPerGram = sugar/quantityInGrams;
        this.fiberPerGram = fiber/quantityInGrams;
        this.fatPerGram = fat/quantityInGrams;
    }

    public double getCaloriesPerGram() {
        return caloriesPerGram;
    }


    public double getCaloriesPerOunce() {
        return CalorieConversion.convertGramsToOunces(getCaloriesPerGram());
    }

    public String getName() {
        return name;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setServingUnit(String servingUnit) {
        this.servingUnit = servingUnit;
    }

    public void setServingSize(double servingSize) {
        this.servingSize = servingSize;
    }

    public void setGramsPerServing(double gramsPerServing) {
        this.gramsPerServing = gramsPerServing;
    }

    public void setQuantityInGrams(double quantityInGrams) {
        this.quantityInGrams = quantityInGrams;
    }

    public void setCaloriesPerGram(double caloriesPerGram) {
        this.caloriesPerGram = caloriesPerGram;
    }

    public void setProteinPerGram(double proteinPerGram) {
        this.proteinPerGram = proteinPerGram;
    }

    public void setSugarPerGram(double sugarPerGram) {
        this.sugarPerGram = sugarPerGram;
    }

    public void setFatPerGram(double fatPerGram) {
        this.fatPerGram = fatPerGram;
    }

    public void setFiberPerGram(double fiberPerGram) {
        this.fiberPerGram = fiberPerGram;
    }
}
