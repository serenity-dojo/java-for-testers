package com.serenitydojo.module08enums;

import java.time.DayOfWeek;
import java.time.Month;

/**
 * Exercise 8.1b: Switch expressions.
 */
public class CalendarHelper {

    /**
     * Returns the number of days in the month. February has 29 days in a leap year, and 28 otherwise.
     * April, June, September and November have 30 days, all other months have 31.
     * <p>
     * Hint: a switch expression can list several values in one case, e.g. <code>case APRIL, JUNE -> 30;</code>
     */
    public int daysIn(Month month, boolean leapYear) {
        // TODO: use a switch expression
        return 0;
    }

    /**
     * Returns "Weekend" for Saturday and Sunday, and "Weekday" for all other days.
     */
    public String typeOfDay(DayOfWeek day) {
        // TODO: use a switch expression
        return "";
    }

    /**
     * Converts the name of a season into the typical weather: "Winter" is "Cold", "Summer" is "Hot",
     * "Spring" and "Autumn" are "Mild". Anything else is "Unknown". (Switching on a String works too.)
     */
    public String weatherIn(String season) {
        // TODO: use a switch expression on the String
        return "";
    }
}
