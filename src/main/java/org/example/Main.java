package org.example;

public class Main {
    public static void main(String[] args) {

        double plnToEurRate = 0.22;
        double plnToUsdRate = 0.23;
        double eurToUsdRate = 1.05;

        ConvertPlnToEur plnToEurConverter = new ConvertPlnToEur(plnToEurRate);
        ConvertPlnToUsd plnToUsdConverter = new ConvertPlnToUsd(plnToUsdRate);
        ConvertEurToUsd eurToUsdConverter = new ConvertEurToUsd(eurToUsdRate);

        double amountInPln = 100.0;

        double amountInEur = plnToEurConverter.convert(plnToEurRate);
        double amountInUsd = plnToUsdConverter.convert(plnToUsdRate);
        double amountInUsdFromEuro = eurToUsdConverter.convert(eurToUsdRate);

        System.out.println(amountInPln + "PLN is approximately " + amountInEur + "EUR.");
        System.out.println(amountInPln + "PLN is approximately " + amountInUsd + "USD.");
        System.out.println(amountInEur + "EUR is approximately " + amountInUsdFromEuro + "USD");
    }
}