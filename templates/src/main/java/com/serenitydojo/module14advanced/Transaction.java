package com.serenitydojo.module14advanced;

/**
 * A single line of a bank statement: positive amounts are deposits, negative amounts are withdrawals.
 * (This is a record - see Exercise 14.5.)
 */
public record Transaction(String counterparty, double amount) {

    public boolean isDeposit() {
        return amount > 0;
    }

    public boolean isWithdrawal() {
        return amount < 0;
    }
}
