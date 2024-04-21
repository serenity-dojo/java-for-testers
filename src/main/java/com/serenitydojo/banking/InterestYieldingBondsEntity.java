package com.serenitydojo.banking;

public class InterestYieldingBondsEntity implements IInterestBearing {

	private double value;
	private double interestRate;

	public InterestYieldingBondsEntity(double value, double interestRate) {
		this.value = value;
		this.interestRate = interestRate;
	}

	@Override
	public double calculateMonthlyInterest() {
		return (value * interestRate) / 12;
	}

}