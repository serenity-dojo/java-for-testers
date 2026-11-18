package com.serenitydojo.module14advanced;

import java.util.function.DoubleBinaryOperator;

/**
 * Exercise 14.6: Advanced enums.
 * <p>
 * Enums can have fields, constructors and methods, and each constant can carry its own behaviour.
 */
public enum Operation {
    // TODO: give each constant its symbol ("+", "-", "*", "/") and its behaviour.
    //       Add a constructor which takes a String and a DoubleBinaryOperator, for example:
    //          ADD("+", (a, b) -> a + b)
    //       DIVIDE must throw an ArithmeticException("Cannot divide by zero") if the divisor is zero.
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    public String getSymbol() {
        // TODO: return the symbol of this operation
        return "";
    }

    public double apply(double a, double b) {
        // TODO: apply the behaviour of this operation to the two numbers
        return 0;
    }

    /**
     * Finds the operation for a symbol such as "+".
     *
     * @throws IllegalArgumentException if there is no operation with that symbol
     */
    public static Operation fromSymbol(String symbol) {
        // TODO: look for the operation with this symbol, or throw an IllegalArgumentException
        return null;
    }
}
