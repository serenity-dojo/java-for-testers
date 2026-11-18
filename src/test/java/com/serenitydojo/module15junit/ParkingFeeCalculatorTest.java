package com.serenitydojo.module15junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Exercise 15.11: JUnit 6 comprehensive exercise.
 * <p>
 * Write a complete set of tests for the weekday rules of the ParkingFeeCalculator class
 * (the feeFor(int hours) method). See the exercise instructions for what to cover.
 * Use everything you have learned in this module: good test names and @DisplayName, @Nested groups,
 * parameterized tests, exception tests and clear AssertJ assertions.
 */
@DisplayName("The parking fee calculator")
class ParkingFeeCalculatorTest {

    private final ParkingFeeCalculator calculator = new ParkingFeeCalculator();

    @Nested
    @DisplayName("charges nothing")
    class ForShortStays {

        @Test
        @DisplayName("for the first hour")
        void shouldBeFreeForTheFirstHour() {
            assertThat(calculator.feeFor(1)).isEqualTo(0.00);
        }
    }

    @Nested
    @DisplayName("charges 2.50 for each extra hour")
    class ForNormalStays {

        @ParameterizedTest(name = "{0} hours costs {1}")
        @CsvSource({"2, 2.50", "3, 5.00", "4, 7.50", "8, 17.50"})
        void shouldChargeForEachHourAfterTheFirst(int hours, double expectedFee) {
            assertThat(calculator.feeFor(hours)).isEqualTo(expectedFee);
        }
    }

    @Nested
    @DisplayName("never charges more than 20.00")
    class ForLongStays {

        @ParameterizedTest(name = "{0} hours costs 20.00")
        @ValueSource(ints = {9, 12, 24})
        void shouldCapTheDailyFee(int hours) {
            assertThat(calculator.feeFor(hours)).isEqualTo(20.00);
        }

        @Test
        @DisplayName("exactly at the cap after 9 hours")
        void shouldReachTheCapAfterNineHours() {
            assertThat(calculator.feeFor(8)).isLessThan(20.00);
            assertThat(calculator.feeFor(9)).isEqualTo(20.00);
        }
    }

    @Nested
    @DisplayName("rejects stays that are not between 1 and 24 hours")
    class ForInvalidStays {

        @ParameterizedTest(name = "{0} hours is rejected")
        @ValueSource(ints = {0, -1, 25, 100})
        void shouldRejectInvalidNumbersOfHours(int hours) {
            assertThatThrownBy(() -> calculator.feeFor(hours))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("You can park for between 1 and 24 hours");
        }
    }
}
