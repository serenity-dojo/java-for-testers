package com.serenitydojo.banking;

public class CurrentAccount extends BankAccount {
    private double overdraft;

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
