package com.serenitydojo.module13exceptions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.within;

/**
 * Exercise 13.4: Custom exceptions. Complete InsufficientFundsException, and the spend() method of Wallet.
 */
class WhenUsingCustomExceptionsTest {

    @Test
    void shouldSpendMoneyFromTheWallet() throws InsufficientFundsException {
        Wallet wallet = new Wallet(100.00);

        wallet.spend(30.00);

        assertThat(wallet.getBalance()).isCloseTo(70.00, within(0.001));
    }

    @Test
    void shouldAllowSpendingTheWholeBalance() throws InsufficientFundsException {
        Wallet wallet = new Wallet(50.00);

        wallet.spend(50.00);

        assertThat(wallet.getBalance()).isZero();
    }

    @Test
    void shouldNotAllowSpendingMoreThanTheBalance() {
        Wallet wallet = new Wallet(50.00);

        assertThatThrownBy(() -> wallet.spend(80.00))
                .isInstanceOf(InsufficientFundsException.class)
                .hasMessage("Insufficient funds: balance 50.00, requested 80.00");
    }

    @Test
    void theBalanceShouldNotChangeWhenSpendingFails() {
        Wallet wallet = new Wallet(50.00);

        try {
            wallet.spend(80.00);
        } catch (InsufficientFundsException expected) {
            // we expect this
        }

        assertThat(wallet.getBalance()).isEqualTo(50.00);
    }

    @Test
    void theExceptionShouldReportHowMuchMoneyIsMissing() {
        Wallet wallet = new Wallet(50.00);

        try {
            wallet.spend(80.00);
        } catch (InsufficientFundsException e) {
            assertThat(e.getShortfall()).isCloseTo(30.00, within(0.001));
            return;
        }
        throw new AssertionError("Expected an InsufficientFundsException");
    }

    @Test
    void anInsufficientFundsExceptionIsACheckedException() {
        assertThat(InsufficientFundsException.class).isAssignableTo(Exception.class);
        assertThat(RuntimeException.class.isAssignableFrom(InsufficientFundsException.class)).isFalse();
    }

    @Test
    void spendingANegativeAmountIsAnIllegalArgument() {
        Wallet wallet = new Wallet(50.00);

        assertThatThrownBy(() -> wallet.spend(-5.00)).isInstanceOf(IllegalArgumentException.class);
    }
}
