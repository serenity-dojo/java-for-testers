package com.serenitydojo.banking;

public class SavingsAccountEntity extends BankAccountEntity implements IInterestBearing {

	private double interestRate;
	 
	public SavingsAccountEntity(int initialBalance, double interestRate) {
		this.interestRate = interestRate;
		setBalance(initialBalance);
	}

	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double calculateMonthlyInterest() {
		return (getInterestRate()*getBalance())/12;
	}

}