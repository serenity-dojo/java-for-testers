package com.serenitydojo.module15junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Exercise 15.11: JUnit 6 comprehensive exercise.
 * <p>
 * Write a complete set of tests for the weekday rules of the ParkingFeeCalculator class
 * (the feeFor(int hours) method). See the exercise instructions for what to cover.
 * Use everything you have learned in this module: good test names and @DisplayName, @Nested groups,
 * parameterized tests, exception tests and clear AssertJ assertions.
 */
class ParkingFeeCalculatorTest {

    @Test
    void writeTheTestsForTheParkingFeeCalculator() {
        // TODO: replace this test with a complete set of tests for ParkingFeeCalculator.feeFor(int hours):
        //   - the first hour is free
        //   - each extra hour costs 2.50
        //   - the fee never exceeds 20.00 (check the boundary, where the cap starts to apply)
        //   - 0, negative and more than 24 hours are rejected with an IllegalArgumentException
        fail("TODO: write the tests");
    }
}
