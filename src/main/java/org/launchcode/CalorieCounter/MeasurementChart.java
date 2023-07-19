package org.launchcode.CalorieCounter;

import java.util.HashMap;

public class MeasurementChart {
    public String name;
    public HashMap<String, Double> conversionChart;
    public MeasurementChart(String name) {
        this.name = name;
    }
    public MeasurementChart(String name, String unitOne, Double unitOneConversion, String unitTwo, Double unitTwoConversion) {
        this(name);
        conversionChart = new HashMap<>();
        conversionChart.put(unitOne, unitOneConversion);
        conversionChart.put(unitTwo, unitTwoConversion);
    }
    public MeasurementChart(String name, String unitOne, Double unitOneConversion, String unitTwo, Double unitTwoConversion, String unitThree, Double unitThreeConversion) {
        this(name, unitOne,unitOneConversion, unitTwo, unitTwoConversion);
        conversionChart.put(unitThree, unitThreeConversion);
    }
    public MeasurementChart(String name, String unitOne, Double unitOneConversion, String unitTwo, Double unitTwoConversion, String unitThree, Double unitThreeConversion, String unitFour, Double unitFourConversion) {
        this(name, unitOne, unitOneConversion, unitTwo, unitTwoConversion, unitThree, unitThreeConversion);
        conversionChart.put(unitFour, unitFourConversion);
    }
    public MeasurementChart(String name, String unitOne, Double unitOneConversion, String unitTwo, Double unitTwoConversion, String unitThree, Double unitThreeConversion, String unitFour, Double unitFourConversion, String unitFive, Double unitFiveConversion) {
        this(name, unitOne, unitOneConversion, unitTwo, unitTwoConversion, unitThree, unitThreeConversion, unitFour, unitFourConversion);
        conversionChart.put(unitFive, unitFiveConversion);
    }
    public MeasurementChart(String name, String unitOne, Double unitOneConversion, String unitTwo, Double unitTwoConversion, String unitThree, Double unitThreeConversion, String unitFour, Double unitFourConversion, String unitFive, Double unitFiveConversion, String unitSix, Double unitSixConversion) {
        this(name, unitOne, unitOneConversion, unitTwo, unitTwoConversion, unitThree, unitThreeConversion, unitFour, unitFourConversion, unitFive, unitFiveConversion);
        conversionChart.put(unitSix, unitSixConversion);
    }
    public void addMeasurement(String newUnit, Double newUnitConversion) {
        conversionChart.put(newUnit, newUnitConversion);
    }
}
