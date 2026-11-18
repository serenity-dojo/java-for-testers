package com.serenitydojo.module11assertions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.assertj.core.data.Percentage.withPercentage;

/**
 * Exercise 11.1: Basic assertions.
 * <p>
 * Each test sets up some values. Write an AssertJ assertion for each one, using assertThat(...).
 * In the starter project each test fails until you replace the fail() line with a real assertion.
 */
class WhenWritingBasicAssertionsTest {

    @Test
    void whenTwoNumbersAreEqual() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;

        // Check that the sum is 35
        assertThat(sum).isEqualTo(35);
    }

    @Test
    void whenANumberIsGreaterThanAnother() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;

        // Check that the sum is greater than 30
        assertThat(sum).isGreaterThan(30);
    }

    @Test
    void whenANumberIsInACertainInterval() {
        int a = 5;
        int b = 10;
        int sum = a + b;

        // Check that the sum is between 10 and 20
        assertThat(sum).isBetween(10, 20);
    }

    @Test
    void whenANumberIsCloseToAnotherValue() {
        double roughlyOneHundred = 99;

        // Check that the value is within 10% of 100
        assertThat(roughlyOneHundred).isCloseTo(100, withPercentage(10));
    }

    @Test
    void whenADecimalIsCloseToAnotherValue() {
        double sum = 0.1 + 0.2;

        // Check that the sum is within 0.0001 of 0.3
        assertThat(sum).isCloseTo(0.3, within(0.0001));
    }

    @Test
    void whenABooleanIsTrue() {
        boolean isRaining = "rain".length() == 4;

        // Check that it is raining
        assertThat(isRaining).isTrue();
    }

    @Test
    void whenAValueIsNull() {
        String middleName = null;

        // Check that there is no middle name
        assertThat(middleName).isNull();
    }

    @Test
    void whenAnObjectHasADescription() {
        int sum = 5 + 10;

        // Check that the sum is 15, and add a description that is shown if the assertion fails
        assertThat(sum).as("the sum of five and ten").isEqualTo(15);
    }
}
