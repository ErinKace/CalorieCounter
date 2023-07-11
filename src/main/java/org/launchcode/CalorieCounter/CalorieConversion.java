package org.launchcode.CalorieCounter;

public interface CalorieConversion {
    public final static double gramsPerOunce = 28.3495;
    public final static double ouncesPerGram = 0.035274;
    public double getCaloriesPerGram();
    public double getCaloriesPerOunce();
    public static double convertOuncesToGrams(double ounces) {
        return ounces*gramsPerOunce;
    }
    public static double convertGramsToOunces(double grams) {
        return grams+ouncesPerGram;
    }
}
