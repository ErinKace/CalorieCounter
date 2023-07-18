package org.launchcode.CalorieCounter;

import java.util.Objects;

public abstract class FoodStuff {
    private int id;
    private int nextId;
    private String name;
    private double quantityInGrams;

    FoodStuff() {
        this.id = nextId;
        nextId++;
    }
    FoodStuff(String name, double quantity) {
        this();
        this.name = name;
        this.quantityInGrams = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantityInGrams() {
        return quantityInGrams;
    }
    public void setQuantityInGrams(double quantityInGrams) {
        this.quantityInGrams = quantityInGrams;
    }
    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodStuff foodStuff)) return false;
        return id == foodStuff.id && Objects.equals(name, foodStuff.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public abstract double getCalories();
    public abstract double getProtein();
    public abstract double getFiber();
    public abstract double getFat();
    public abstract double getSugar();

}
