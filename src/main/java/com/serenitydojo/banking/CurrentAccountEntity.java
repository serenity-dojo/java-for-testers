package com.serenitydojo.banking;

public class CurrentAccountEntity extends BankAccountEntity {
	
	private double overdraft;

	/**
	 * @return the overdraft
	 */
	public double getOverdraft() {
		return overdraft;
	}

	/**
	 * @param overdraft the overdraft to set
	 */
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

}