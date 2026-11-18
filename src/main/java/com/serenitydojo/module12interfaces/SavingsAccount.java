package com.serenitydojo.module12interfaces;

/**
 * Exercise 12.1a: a savings account pays interest on its balance.
 */
public class SavingsAccount implements InterestBearing {
    private final double balance;
    private final double annualInterestRate;

    /**
     * @param annualInterestRate the yearly rate as a fraction, e.g. 0.03 for 3%
     */
    public SavingsAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * The monthly interest is the balance multiplied by the annual rate, divided by 12.
     */
    @Override
    public double monthlyInterest() {
        // TODO: calculate the monthly interest
        return 0;
    }
}
