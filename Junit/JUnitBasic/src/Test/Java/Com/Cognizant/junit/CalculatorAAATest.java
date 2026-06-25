package com.cognizant.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAAATest {

    Calculator calculator;

    @BeforeEach
    void setup() {

        calculator = new Calculator();

        System.out.println("Setup Executed");
    }

    @AfterEach
    void teardown() {

        System.out.println("Teardown Executed");
    }

    @Test
    void testMultiply() {

        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(6, result);
    }
}