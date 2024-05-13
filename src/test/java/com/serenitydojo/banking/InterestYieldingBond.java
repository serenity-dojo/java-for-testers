package com.serenitydojo.banking;

public class InterestYieldingBond implements InterestBearing{


    private double value;
    private double interestRate;

    public InterestYieldingBond(double value, double interestRate) {
        this.value = value;
        this.interestRate = interestRate;
    }

    @Override
    public double calculateMonthlyInterest(){
        return value * interestRate / 12;
    }
}
