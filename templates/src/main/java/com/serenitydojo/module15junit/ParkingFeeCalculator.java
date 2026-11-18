package com.serenitydojo.module15junit;

import java.time.DayOfWeek;

/**
 * Calculates car park fees. Used for the comprehensive exercises 15.11 and 15.12.
 * <p>
 * Weekday rules:
 * <ul>
 *   <li>The first hour is free</li>
 *   <li>Each extra hour costs 2.50</li>
 *   <li>The fee for a day never exceeds 20.00</li>
 *   <li>You can park for between 1 and 24 hours</li>
 * </ul>
 * Weekend rules (Exercise 15.12):
 * <ul>
 *   <li>The first two hours are free</li>
 *   <li>Each extra hour costs 1.50</li>
 *   <li>The fee for a day never exceeds 12.00</li>
 * </ul>
 */
public class ParkingFeeCalculator {

    /**
     * The fee for a weekday.
     *
     * @throws IllegalArgumentException if the hours are not between 1 and 24
     */
    public double feeFor(int hours) {
        if (hours < 1 || hours > 24) {
            throw new IllegalArgumentException("You can park for between 1 and 24 hours");
        }
        return Math.min(20.00, (hours - 1) * 2.50);
    }

    /**
     * The fee for a particular day of the week. Saturdays and Sundays have the weekend rates.
     *
     * @throws IllegalArgumentException if the hours are not between 1 and 24
     */
    public double feeFor(int hours, DayOfWeek day) {
//@@ solution
        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            if (hours < 1 || hours > 24) {
                throw new IllegalArgumentException("You can park for between 1 and 24 hours");
            }
            return Math.min(12.00, Math.max(0, hours - 2) * 1.50);
        }
        return feeFor(hours);
//@@ starter
        // TODO (Exercise 15.12): implement the weekend rates, so that WhenParkingAtTheWeekendTest passes
        return -1;
//@@ end
    }
}
