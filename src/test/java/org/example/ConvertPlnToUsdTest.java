package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ConvertPlnToUsdTest {

    @Autowired
    double plnToUsdRate;

    @Autowired
    double convertPlnToUsd;
    @Autowired
    double amountInPln;

    @DisplayName("PLN to USD")
    @Test
    void shouldConvertPlnToUsd() {

        ConvertPlnToUsd converter = new ConvertPlnToUsd(plnToUsdRate);

        double converterAmount = converter.convert(amountInPln);

        double expectedAmountInUsd = amountInPln * plnToUsdRate;

        assertEquals(expectedAmountInUsd, converterAmount, 0.001);

    }

}