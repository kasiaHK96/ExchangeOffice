package org.example;

public class ConvertEurToUsd {

    double eurToUsdRate;

    public ConvertEurToUsd(double eurToUsdRate) {
        this.eurToUsdRate = eurToUsdRate;
    }

    public double convert(double amountInEur) {
        return amountInEur * eurToUsdRate;
    }
}
