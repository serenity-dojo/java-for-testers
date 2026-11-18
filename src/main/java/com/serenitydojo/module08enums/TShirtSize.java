package com.serenitydojo.module08enums;

/**
 * Exercise 8.2: Enums.
 */
public enum TShirtSize {
    // TODO: give each size a maximum chest measurement (in cm), using a private field and a constructor:
    //       SMALL = 90, MEDIUM = 100, LARGE = 110, EXTRA_LARGE = 120
    SMALL,
    MEDIUM,
    LARGE,
    EXTRA_LARGE;

    public int getMaxChestCm() {
        // TODO: return the maximum chest measurement of this size
        return 0;
    }

    /**
     * Finds the smallest size that fits the chest measurement.
     * Returns null if even the largest size is too small.
     */
    public static TShirtSize forChest(int chestCm) {
        // TODO: loop through values() and return the first size that fits
        return null;
    }
}
