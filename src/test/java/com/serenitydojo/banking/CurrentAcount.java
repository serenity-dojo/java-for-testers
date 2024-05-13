package com.serenitydojo.banking;

public class CurrentAcount extends BankAccount{

    private double overdraft;

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

}
