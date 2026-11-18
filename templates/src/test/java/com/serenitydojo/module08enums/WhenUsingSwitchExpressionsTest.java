package com.serenitydojo.module08enums;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 8.1b: Switch expressions. Implement the methods of CalendarHelper.
 */
class WhenUsingSwitchExpressionsTest {

    private final CalendarHelper calendar = new CalendarHelper();

    @Test
    void mostMonthsHave31Days() {
        assertThat(calendar.daysIn(Month.JANUARY, false)).isEqualTo(31);
        assertThat(calendar.daysIn(Month.AUGUST, false)).isEqualTo(31);
        assertThat(calendar.daysIn(Month.DECEMBER, true)).isEqualTo(31);
    }

    @Test
    void someMonthsHave30Days() {
        assertThat(calendar.daysIn(Month.APRIL, false)).isEqualTo(30);
        assertThat(calendar.daysIn(Month.JUNE, false)).isEqualTo(30);
        assertThat(calendar.daysIn(Month.SEPTEMBER, false)).isEqualTo(30);
        assertThat(calendar.daysIn(Month.NOVEMBER, true)).isEqualTo(30);
    }

    @Test
    void februaryDependsOnTheYear() {
        assertThat(calendar.daysIn(Month.FEBRUARY, false)).isEqualTo(28);
        assertThat(calendar.daysIn(Month.FEBRUARY, true)).isEqualTo(29);
    }

    @Test
    void weekendsAndWeekdays() {
        assertThat(calendar.typeOfDay(DayOfWeek.SATURDAY)).isEqualTo("Weekend");
        assertThat(calendar.typeOfDay(DayOfWeek.SUNDAY)).isEqualTo("Weekend");
        assertThat(calendar.typeOfDay(DayOfWeek.MONDAY)).isEqualTo("Weekday");
        assertThat(calendar.typeOfDay(DayOfWeek.FRIDAY)).isEqualTo("Weekday");
    }

    @Test
    void switchingOnStrings() {
        assertThat(calendar.weatherIn("Winter")).isEqualTo("Cold");
        assertThat(calendar.weatherIn("Summer")).isEqualTo("Hot");
        assertThat(calendar.weatherIn("Spring")).isEqualTo("Mild");
        assertThat(calendar.weatherIn("Autumn")).isEqualTo("Mild");
        assertThat(calendar.weatherIn("Monsoon")).isEqualTo("Unknown");
    }
}
