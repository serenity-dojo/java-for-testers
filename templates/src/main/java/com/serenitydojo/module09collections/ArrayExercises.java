package com.serenitydojo.module09collections;

/**
 * Exercise 9.1: Arrays.
 */
public class ArrayExercises {

    /**
     * Adds up all the numbers in the array. An empty array has a sum of zero.
     */
    public static int sum(int[] numbers) {
//@@ solution
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
//@@ starter
        // TODO: loop through the array, adding up the numbers
        return 0;
//@@ end
    }

    /**
     * Returns the largest number in the array.
     *
     * @throws IllegalArgumentException if the array is empty
     */
    public static int largest(int[] numbers) {
//@@ solution
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
//@@ starter
        // TODO: find the largest number, and throw an IllegalArgumentException for an empty array
        return 0;
//@@ end
    }

    /**
     * Returns a new array containing the same elements in reverse order. The original array is not changed.
     */
    public static int[] reverse(int[] numbers) {
//@@ solution
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[numbers.length - 1 - i] = numbers[i];
        }
        return reversed;
//@@ starter
        // TODO: create a new array and fill it in reverse order
        return new int[0];
//@@ end
    }

    /**
     * Returns true if the array contains the value.
     */
    public static boolean contains(String[] values, String value) {
//@@ solution
        for (String candidate : values) {
            if (candidate.equals(value)) {
                return true;
            }
        }
        return false;
//@@ starter
        // TODO: loop through the array looking for the value
        return false;
//@@ end
    }

    /**
     * Counts how many times the value appears in the array.
     */
    public static int countOccurrences(int[] numbers, int value) {
//@@ solution
        int count = 0;
        for (int number : numbers) {
            if (number == value) {
                count++;
            }
        }
        return count;
//@@ starter
        // TODO: count the matching elements
        return 0;
//@@ end
    }
}
