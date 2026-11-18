package com.serenitydojo.module12interfaces;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

/**
 * Exercise 12.1: Using interfaces to model domain behaviour.
 * Implement monthlyInterest() in SavingsAccount and InterestYieldingBond, and the methods of Portfolio.
 */
class WhenCalculatingMonthlyInterestTest {

    @Test
    void aSavingsAccountEarnsInterestOnItsBalance() {
        SavingsAccount savings = new SavingsAccount(12_000, 0.03);

        assertThat(savings.monthlyInterest()).isCloseTo(30.0, within(0.001));
    }

    @Test
    void aBondEarnsInterestOnItsFaceValue() {
        InterestYieldingBond bond = new InterestYieldingBond(24_000, 0.05);

        assertThat(bond.monthlyInterest()).isCloseTo(100.0, within(0.001));
    }

    @Test
    void savingsAccountsAndBondsCanBothBeUsedAsInterestBearing() {
        InterestBearing first = new SavingsAccount(12_000, 0.03);
        InterestBearing second = new InterestYieldingBond(24_000, 0.05);

        assertThat(first.monthlyInterest()).isCloseTo(30.0, within(0.001));
        assertThat(second.monthlyInterest()).isCloseTo(100.0, within(0.001));
    }

    @Test
    void anEmptyPortfolioEarnsNothing() {
        Portfolio portfolio = new Portfolio();

        assertThat(portfolio.totalMonthlyInterest()).isZero();
        assertThat(portfolio.highestYieldingHolding()).isEmpty();
    }

    @Test
    void aPortfolioAddsUpTheInterestOfAllItsHoldings() {
        Portfolio portfolio = new Portfolio();
        portfolio.add(new SavingsAccount(12_000, 0.03));
        portfolio.add(new InterestYieldingBond(24_000, 0.05));
        portfolio.add(new SavingsAccount(6_000, 0.02));

        assertThat(portfolio.size()).isEqualTo(3);
        assertThat(portfolio.totalMonthlyInterest()).isCloseTo(140.0, within(0.001));
    }

    @Test
    void aPortfolioCanFindItsHighestYieldingHolding() {
        InterestYieldingBond bond = new InterestYieldingBond(24_000, 0.05);
        Portfolio portfolio = new Portfolio();
        portfolio.add(new SavingsAccount(12_000, 0.03));
        portfolio.add(bond);

        assertThat(portfolio.highestYieldingHolding()).contains(bond);
    }

    @Test
    void aPortfolioCanHoldAnyKindOfInterestBearingThing() {
        Portfolio portfolio = new Portfolio();
        portfolio.add(() -> 12.5);

        assertThat(portfolio.totalMonthlyInterest()).isEqualTo(12.5);
    }
}
