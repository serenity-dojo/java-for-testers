package com.serenitydojo.module13exceptions;

import java.util.Locale;

/**
 * Exercise 13.4: Custom exceptions.
 * <p>
 * This is a checked exception, thrown when someone tries to spend more money than they have.
 */
//@@ solution
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
//@@ starter
public class InsufficientFundsException extends Exception {

    // TODO: store the shortfall (the amount requested minus the balance), and give the exception a message like:
    //       "Insufficient funds: balance 50.00, requested 80.00"  (use String.format(Locale.ROOT, "%.2f", ...))
    public InsufficientFundsException(double balance, double amountRequested) {
        super("TODO");
    }

    public double getShortfall() {
        // TODO: return the shortfall
        return 0;
    }
}
//@@ end
