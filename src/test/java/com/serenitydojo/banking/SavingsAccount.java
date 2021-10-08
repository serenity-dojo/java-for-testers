package com.serenitydojo.banking;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    public double calculateMonthlyInterest(){
        return interestRate * getBalance()/12;
    }
}
