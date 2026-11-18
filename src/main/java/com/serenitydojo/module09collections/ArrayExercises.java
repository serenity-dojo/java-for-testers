package com.serenitydojo.module09collections;

/**
 * Exercise 9.1: Arrays.
 */
public class ArrayExercises {

    /**
     * Adds up all the numbers in the array. An empty array has a sum of zero.
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    /**
     * Returns the largest number in the array.
     *
     * @throws IllegalArgumentException if the array is empty
     */
    public static int largest(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int largest = numbers[0];
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

    /**
     * Returns a new array containing the same elements in reverse order. The original array is not changed.
     */
    public static int[] reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[numbers.length - 1 - i] = numbers[i];
        }
        return reversed;
    }

    /**
     * Returns true if the array contains the value.
     */
    public static boolean contains(String[] values, String value) {
        for (String candidate : values) {
            if (candidate.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Counts how many times the value appears in the array.
     */
    public static int countOccurrences(int[] numbers, int value) {
        int count = 0;
        for (int number : numbers) {
            if (number == value) {
                count++;
            }
        }
        return count;
    }
}
