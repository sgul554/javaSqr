package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"'squares within',200,300,3",
            "'squares out, lower bound',0,99,0",
            "'squares within, on the border',100,600,15",
            "'squares out, upper bound',9900,10000,0"})
    void squaresCalculator(String testName, int lowerBound, int upperBound, int expected) {
        SQRService service = new SQRService();
        int actual = service.squareCalculate(lowerBound, upperBound);
        assertEquals(expected, actual);
    }
}