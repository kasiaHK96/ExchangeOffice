package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ConvertPlnToEurTest {

    @Autowired
    double amountInPln;
    @Autowired
    double plnToEurRate;
    @Autowired
    double convertPlnToEur;

    @DisplayName("PLN to Euro")
    @Test
    void shouldConvertPlnToEur() {

        ConvertPlnToEur converter = new ConvertPlnToEur(plnToEurRate);

        double converterAmount = converter.convert(amountInPln);

        double expectedAmountInEur = amountInPln * plnToEurRate;

        assertEquals(expectedAmountInEur, converterAmount, 0.001);
    }

}