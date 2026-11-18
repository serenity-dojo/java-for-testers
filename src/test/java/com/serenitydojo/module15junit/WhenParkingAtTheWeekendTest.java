package com.serenitydojo.module15junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Exercise 15.12: JUnit 6 comprehensive exercise (part 2).
 * <p>
 * These tests are already written. Use test-driven development: make them pass by implementing
 * the weekend rules in ParkingFeeCalculator.feeFor(int hours, DayOfWeek day).
 */
@DisplayName("When parking at the weekend")
class WhenParkingAtTheWeekendTest {

    private final ParkingFeeCalculator calculator = new ParkingFeeCalculator();

    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = {"SATURDAY", "SUNDAY"})
    @DisplayName("the first two hours are free")
    void shouldBeFreeForTheFirstTwoHours(DayOfWeek day) {
        assertThat(calculator.feeFor(1, day)).isEqualTo(0.00);
        assertThat(calculator.feeFor(2, day)).isEqualTo(0.00);
    }

    @ParameterizedTest(name = "{0} hours costs {1}")
    @CsvSource({"3, 1.50", "4, 3.00", "6, 6.00", "9, 10.50"})
    @DisplayName("each extra hour costs 1.50")
    void shouldChargeForEachHourAfterTheFirstTwo(int hours, double expectedFee) {
        assertThat(calculator.feeFor(hours, DayOfWeek.SATURDAY)).isEqualTo(expectedFee);
    }

    @ParameterizedTest(name = "{0} hours costs 12.00")
    @CsvSource({"10", "16", "24"})
    @DisplayName("the weekend fee never exceeds 12.00")
    void shouldCapTheWeekendFee(int hours) {
        assertThat(calculator.feeFor(hours, DayOfWeek.SUNDAY)).isEqualTo(12.00);
    }

    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"})
    @DisplayName("weekdays still use the weekday rates")
    void shouldUseTheWeekdayRatesOnWeekdays(DayOfWeek day) {
        assertThat(calculator.feeFor(3, day)).isEqualTo(5.00);
        assertThat(calculator.feeFor(12, day)).isEqualTo(20.00);
    }

    @Test
    @DisplayName("invalid stays are still rejected")
    void shouldRejectInvalidNumbersOfHours() {
        assertThatThrownBy(() -> calculator.feeFor(0, DayOfWeek.SATURDAY))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> calculator.feeFor(25, DayOfWeek.SUNDAY))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
