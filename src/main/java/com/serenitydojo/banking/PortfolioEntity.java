package com.serenitydojo.banking;
import java.util.ArrayList;
import java.util.List;

public class PortfolioEntity {

	private List<IInterestBearing> accounts=new ArrayList<>();

	public void add(IInterestBearing account) {
		this.accounts.add(account);
	}

	public double calculateMonthlyInterest() {
		double sum = 0.0;
		for (IInterestBearing account : accounts) {
			sum = sum + account.calculateMonthlyInterest();
		}
		return sum;
	}

}