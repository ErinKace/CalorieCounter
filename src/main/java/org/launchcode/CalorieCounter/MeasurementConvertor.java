package org.launchcode.CalorieCounter;

import java.util.HashMap;
import java.util.Map;

public class MeasurementConvertor {
    public final static double gramsPerOunce = 28.3495;
    public final static double ouncesPerGram = 0.035274;
    public HashMap<String, HashMap> measurementConvertor;
    public MeasurementConvertor() {
        MeasurementChart[] measurementCharts = createConversionMaps();
        measurementConvertor = new HashMap<>();
        for (MeasurementChart chart : measurementCharts) {
            measurementConvertor.put(chart.name,chart.conversionChart);
        }
    }
    public MeasurementChart[] createConversionMaps() {
        MeasurementChart teaspoon = new MeasurementChart("teaspoon","tbsp", 3.0,"c",48.0);
        MeasurementChart tablespoon = new MeasurementChart("tablespoon", "tsp", 0.3333333333333333, "c",16.0);
        MeasurementChart cup = new MeasurementChart("cup", "tsp", 0.0205372,"tbsp", 0.0625);
        MeasurementChart grams = new MeasurementChart("grams","oz", 28.3495, "mg",0.001);
        MeasurementChart ounces = new MeasurementChart("ounces", "g", 0.035274, "ml", 0.033814);
        MeasurementChart milliliters = new MeasurementChart("milliliters", "g", 100.0, "ounces", 29.5735);
        return new MeasurementChart[]{teaspoon, tablespoon, cup, grams, ounces, milliliters};
    }
    public static double convertOuncesToGrams(double ounces) {
        return ounces*gramsPerOunce;
    }
    public static double convertGramsToOunces(double grams) {
        return grams*ouncesPerGram;
    }
    public double convertMeasurement(double aMeasurement, String unitOfMeasurement, String newUnitOfMeasurement) {
        HashMap<String, Double> conversionChart = measurementConvertor.get(newUnitOfMeasurement);
        Double conversion = conversionChart.get(unitOfMeasurement);
        return conversion*aMeasurement;
    }
}
