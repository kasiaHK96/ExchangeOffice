package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ConvertEurToUsdTest {

    @Autowired
    double amountInEur;
    @Autowired
    double eurToUsdRate;
    @Autowired
    double convertEurToUsd;

    @DisplayName("EURO to USD")
    @Test
    void shouldConvertEurToUsd() {

        ConvertEurToUsd converter = new ConvertEurToUsd(eurToUsdRate);

        double converterAmount = converter.convert(amountInEur);

        double expectedAmountInUsd = amountInEur * eurToUsdRate;

        assertEquals(expectedAmountInUsd, converterAmount, 0.001);



    }

}