package com.serenitydojo.module13exceptions;

/**
 * Exercise 13.4: a wallet that throws a custom exception if you try to overspend.
 */
public class Wallet {
    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Spends some money. If there is not enough in the wallet, throws an InsufficientFundsException
     * and leaves the balance unchanged. Spending a negative amount throws an IllegalArgumentException.
     */
    public void spend(double amount) throws InsufficientFundsException {
        // TODO: throw an IllegalArgumentException for negative amounts,
        //       throw an InsufficientFundsException if the amount is more than the balance,
        //       otherwise reduce the balance
    }
}
