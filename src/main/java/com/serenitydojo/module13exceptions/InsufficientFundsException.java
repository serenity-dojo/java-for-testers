package com.serenitydojo.module13exceptions;

import java.util.Locale;

/**
 * Exercise 13.4: Custom exceptions.
 * <p>
 * This is a checked exception, thrown when someone tries to spend more money than they have.
 */
public class InsufficientFundsException extends Exception {
    private final double shortfall;

    public InsufficientFundsException(double balance, double amountRequested) {
        super(String.format(Locale.ROOT, "Insufficient funds: balance %.2f, requested %.2f", balance, amountRequested));
        this.shortfall = amountRequested - balance;
    }

    public double getShortfall() {
        return shortfall;
    }
}
