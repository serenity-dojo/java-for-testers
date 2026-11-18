package com.serenitydojo.module14advanced;

import java.util.function.DoubleBinaryOperator;

/**
 * Exercise 14.6: Advanced enums.
 * <p>
 * Enums can have fields, constructors and methods, and each constant can carry its own behaviour.
 */
public enum Operation {
    ADD("+", (a, b) -> a + b),
    SUBTRACT("-", (a, b) -> a - b),
    MULTIPLY("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    });

    private final String symbol;
    private final DoubleBinaryOperator operator;

    Operation(String symbol, DoubleBinaryOperator operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    public String getSymbol() {
        return symbol;
    }

    public double apply(double a, double b) {
        return operator.applyAsDouble(a, b);
    }

    /**
     * Finds the operation for a symbol such as "+".
     *
     * @throws IllegalArgumentException if there is no operation with that symbol
     */
    public static Operation fromSymbol(String symbol) {
        for (Operation operation : values()) {
            if (operation.symbol.equals(symbol)) {
                return operation;
            }
        }
        throw new IllegalArgumentException("Unknown operation: " + symbol);
    }
}
