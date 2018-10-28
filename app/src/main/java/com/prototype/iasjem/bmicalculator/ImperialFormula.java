package com.prototype.iasjem.bmicalculator;

public class ImperialFormula {

    private final double KG_TO_LBS = 2.20462;
    private final double M_TO_IN = 39.3701;
    private double inputKg;
    private double inputM;

    public ImperialFormula(double inputKg, double inputM) {
        this.inputKg = inputKg;
        this.inputM = inputM;
    }

    public double getInputKg() {
        return inputKg;
    }

    public double getInputM() {
        return inputM;
    }

    //This formula will calculate BMI
    public double computeBMI(double kg, double m) {
        double result = 0;
        double lbs = Math.round(kg * KG_TO_LBS);
        double in = Math.round((m * M_TO_IN) * 100);
        result = (lbs / (Math.pow((in / 100), 2))) * 703;
        return result;
    }
}
