package com.serenitydojo.module04methods;

/**
 * Exercise 4.3: a utility class made of static methods.
 */
public class TemperatureConverter {

    /**
     * Converts degrees Celsius to degrees Fahrenheit: multiply by 9/5 and add 32.
     */
    public static double toFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    /**
     * Converts degrees Fahrenheit to degrees Celsius: subtract 32 and multiply by 5/9.
     */
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Returns true if the temperature (in Celsius) is at or below freezing.
     */
    public static boolean isFreezing(double celsius) {
        return celsius <= 0;
    }
}
