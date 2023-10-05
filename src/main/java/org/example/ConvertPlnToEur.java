package org.example;

public class ConvertPlnToEur {

    double plnToEurRate;

    public ConvertPlnToEur(double plnToEurRate) {
        this.plnToEurRate = plnToEurRate;
    }

    public double convert(double amountInPln){
        return amountInPln * plnToEurRate;
    }
}
