package org.example;

public class ConvertPlnToUsd {

    double plnToUsdRate;

    public ConvertPlnToUsd(double plnToEurRate) {
        this.plnToUsdRate = plnToUsdRate;
    }

    public double convert(double amountInPln) {
        return amountInPln * plnToUsdRate;
    }
}
