package com.serenitydojo.banking;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class WhenCalculatingMonthlyInterest {
    @Test
    public void shouldCalculateInterestForSavingsAccount(){
        //Given
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setBalance(1200);
        savingsAccount.setInterestRate(0.01);

        //When

        double earnedInterest = savingsAccount.calculateMonthlyInterest();

        //Then
        Assertions.assertThat(earnedInterest).isEqualTo(1);


    }
    @Test
    public void shouldCalculateInterestForBonds(){
        //Given
        InterestYieldingBonds bonds = new InterestYieldingBonds(1200,0.01);

        //When
        double earnedInterest = bonds.calculateMonthlyInterest();

        //Then
        Assertions.assertThat(earnedInterest).isEqualTo(1);


    }
}
