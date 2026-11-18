package com.serenitydojo.module08enums;

/**
 * Exercise 8.2: Enums.
 */
public enum TShirtSize {
    SMALL(90),
    MEDIUM(100),
    LARGE(110),
    EXTRA_LARGE(120);

    private final int maxChestCm;

    TShirtSize(int maxChestCm) {
        this.maxChestCm = maxChestCm;
    }

    public int getMaxChestCm() {
        return maxChestCm;
    }

    /**
     * Finds the smallest size that fits the chest measurement.
     * Returns null if even the largest size is too small.
     */
    public static TShirtSize forChest(int chestCm) {
        for (TShirtSize size : values()) {
            if (chestCm <= size.maxChestCm) {
                return size;
            }
        }
        return null;
    }
}
