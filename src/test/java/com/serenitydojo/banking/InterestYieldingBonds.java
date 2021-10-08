package com.serenitydojo.banking;

public class InterestYieldingBonds {
    private double value;
    private double interestRate;

    public InterestYieldingBonds(double value,double interestRate){
        this.value = value;
        this.interestRate = interestRate;
    }

    public double calculateMonthlyInterest(){
        return value * interestRate/12;

    }
}
