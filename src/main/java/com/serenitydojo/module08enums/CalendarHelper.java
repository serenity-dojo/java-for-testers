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
        return switch (month) {
            case FEBRUARY -> leapYear ? 29 : 28;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            default -> 31;
        };
    }

    /**
     * Returns "Weekend" for Saturday and Sunday, and "Weekday" for all other days.
     */
    public String typeOfDay(DayOfWeek day) {
        return switch (day) {
            case SATURDAY, SUNDAY -> "Weekend";
            default -> "Weekday";
        };
    }

    /**
     * Converts the name of a season into the typical weather: "Winter" is "Cold", "Summer" is "Hot",
     * "Spring" and "Autumn" are "Mild". Anything else is "Unknown". (Switching on a String works too.)
     */
    public String weatherIn(String season) {
        return switch (season) {
            case "Winter" -> "Cold";
            case "Summer" -> "Hot";
            case "Spring", "Autumn" -> "Mild";
            default -> "Unknown";
        };
    }
}
