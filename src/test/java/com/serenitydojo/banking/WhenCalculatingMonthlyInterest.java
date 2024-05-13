package com.serenitydojo.banking;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenCalculatingMonthlyInterest {

    @Test
    public void shouldCalculateInterestForSavingAccount(){

        // GIVEN
        SavingAccount savingAccount = new SavingAccount(1200.00,0.01);

        // WHEN
        double earnedInterest;
        earnedInterest = savingAccount.calculateMonthlyInterest();

        // THEN
        assertThat(earnedInterest).isEqualTo(1.0);
    }

    @Test
    public void shouldCalculateInterestForBondAccount(){

        double earnedInterest;

        // GIVEN
        InterestYieldingBond bonds = new InterestYieldingBond(1200.00,0.01);

        // WHEN
        earnedInterest = bonds.calculateMonthlyInterest();

        // THEN
        assertThat(earnedInterest).isEqualTo(1.0);
    }

    @Test
        public void calculateInterestEarnedInPortafolio(){

        // GIVEN
        Portafolio portafolio = new Portafolio();
        portafolio.add(new SavingAccount(1200.00,0.01));
        portafolio.add(new InterestYieldingBond(1200.00,0.01));

        // WHEN
        double totalEarnedInterest = portafolio.calculateMonthlyInterest();

        assertThat(totalEarnedInterest).isEqualTo(2.0);
    }
}
