package com.serenitydojo.module07conditionals;

/**
 * Exercise 7.1b: Simple conditional logic.
 */
public class NumberChecks {

    /**
     * Returns true for even numbers.
     */
    public boolean isEven(int number) {
//@@ solution
        return number % 2 == 0;
//@@ starter
        // TODO: a number is even if dividing by 2 leaves no remainder
        return false;
//@@ end
    }

    /**
     * Returns the largest of the three numbers.
     */
    public int largestOf(int a, int b, int c) {
//@@ solution
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        return largest;
//@@ starter
        // TODO: use if statements to find the largest number
        return 0;
//@@ end
    }

    /**
     * Returns true for leap years. A year is a leap year if it is divisible by 4,
     * except for years divisible by 100, unless they are also divisible by 400.
     */
    public boolean isLeapYear(int year) {
//@@ solution
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
//@@ starter
        // TODO: combine conditions with && and ||
        return false;
//@@ end
    }

    /**
     * Returns "Fizz" for multiples of 3, "Buzz" for multiples of 5, "FizzBuzz" for multiples of both,
     * and otherwise the number itself as a String.
     */
    public String fizzBuzz(int number) {
//@@ solution
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
//@@ starter
        // TODO: remember to check for multiples of both 3 and 5 first
        return "";
//@@ end
    }
}
