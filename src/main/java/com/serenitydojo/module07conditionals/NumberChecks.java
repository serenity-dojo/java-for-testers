package com.serenitydojo.module07conditionals;

/**
 * Exercise 7.1b: Simple conditional logic.
 */
public class NumberChecks {

    /**
     * Returns true for even numbers.
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns the largest of the three numbers.
     */
    public int largestOf(int a, int b, int c) {
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        return largest;
    }

    /**
     * Returns true for leap years. A year is a leap year if it is divisible by 4,
     * except for years divisible by 100, unless they are also divisible by 400.
     */
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    /**
     * Returns "Fizz" for multiples of 3, "Buzz" for multiples of 5, "FizzBuzz" for multiples of both,
     * and otherwise the number itself as a String.
     */
    public String fizzBuzz(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
