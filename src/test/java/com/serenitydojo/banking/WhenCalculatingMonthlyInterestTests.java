package com.serenitydojo.banking;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;

public class WhenCalculatingMonthlyInterestTests {

	@Test
	public void shouldCalculateInterestForSavingsAccounts() {
	// GIVEN
	SavingsAccountEntity savingsAccount = new SavingsAccountEntity(1200, 0.01);
	// WHEN
	double earnedInterest = savingsAccount.calculateMonthlyInterest();
	// THEN
	assertThat(earnedInterest).isEqualTo(1.0);
	System.out.println("\nTC-01 - shouldCalculateInterestForSavingsAccounts() - Executed successfully.");
	}

	
	@Test
	public void shouldCalculateInterestForBonds() {
	// GIVEN
	InterestYieldingBondsEntity bonds = new InterestYieldingBondsEntity(1200.0, 0.01);
	// WHEN
	double earnedInterest = bonds.calculateMonthlyInterest();
	// THEN
	assertThat(earnedInterest).isEqualTo(1.0);
	System.out.println("\nTC-02 - shouldCalculateInterestForBonds() - Executed successfully.");
	}

	
	@Test
	public void calculateInterestEarnedInPortfolio() {
	// GIVEN
	PortfolioEntity portfolio = new PortfolioEntity();
	portfolio.add(new SavingsAccountEntity(1200, 0.01));
	portfolio.add(new InterestYieldingBondsEntity(1200.0, 0.01));
	// WHEN
	double totalEarnedInterest = portfolio.calculateMonthlyInterest();
	// THEN
	assertThat(totalEarnedInterest).isEqualTo(2.0);
	System.out.println("\nTC-03 - calculateInterestEarnedInPortfolio() - Executed successfully.");
	}

}