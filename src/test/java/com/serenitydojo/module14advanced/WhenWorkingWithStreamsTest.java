package com.serenitydojo.module14advanced;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

/**
 * Exercise 14.2: Working with streams. Implement the methods of TransactionAnalyser.
 */
class WhenWorkingWithStreamsTest {

    private final Transaction salary = new Transaction("Employer", 2500.00);
    private final Transaction rent = new Transaction("Landlord", -900.00);
    private final Transaction groceries = new Transaction("Supermarket", -120.50);
    private final Transaction refund = new Transaction("Supermarket", 20.50);
    private final Transaction bonus = new Transaction("Employer", 300.00);
    private final Transaction electricity = new Transaction("Power Co", -75.25);

    private final TransactionAnalyser analyser =
            new TransactionAnalyser(List.of(salary, rent, groceries, refund, bonus, electricity));

    @Test
    void shouldCountTheTransactions() {
        assertThat(analyser.numberOfTransactions()).isEqualTo(6);
    }

    @Test
    void shouldCalculateTheBalance() {
        assertThat(analyser.balance()).isCloseTo(1724.75, within(0.001));
    }

    @Test
    void shouldAddUpTheDeposits() {
        assertThat(analyser.totalDeposits()).isCloseTo(2820.50, within(0.001));
    }

    @Test
    void shouldFindTheLargestDeposit() {
        assertThat(analyser.largestDeposit()).contains(salary);
    }

    @Test
    void shouldFindTheLargestWithdrawal() {
        assertThat(analyser.largestWithdrawal()).contains(rent);
    }

    @Test
    void shouldNotFindALargestDepositIfThereAreNoDeposits() {
        TransactionAnalyser noDeposits = new TransactionAnalyser(List.of(rent, groceries));

        assertThat(noDeposits.largestDeposit()).isEmpty();
    }

    @Test
    void shouldFindTransactionsLargerThanAThreshold() {
        assertThat(analyser.transactionsLargerThan(500)).containsExactly(salary, rent);
        assertThat(analyser.transactionsLargerThan(100)).containsExactly(salary, rent, groceries, bonus);
    }

    @Test
    void shouldFindTransactionsWithACounterparty() {
        assertThat(analyser.transactionsWith("Supermarket")).containsExactly(groceries, refund);
        assertThat(analyser.transactionsWith("Nobody")).isEmpty();
    }

    @Test
    void shouldListTheCounterpartiesInAlphabeticalOrderWithoutDuplicates() {
        assertThat(analyser.counterparties())
                .containsExactly("Employer", "Landlord", "Power Co", "Supermarket");
    }

    @Test
    void shouldCalculateTheBalancePerCounterparty() {
        assertThat(analyser.balancePerCounterparty())
                .hasSize(4)
                .containsEntry("Employer", 2800.00)
                .containsEntry("Landlord", -900.00)
                .containsEntry("Power Co", -75.25)
                .containsEntry("Supermarket", -100.00);
    }

    @Test
    void shouldFindInvalidTransactions() {
        Transaction empty = new Transaction("Shop", 0.0);
        Transaction anonymous = new Transaction("  ", 15.0);
        TransactionAnalyser withProblems = new TransactionAnalyser(List.of(salary, empty, anonymous));

        assertThat(withProblems.invalidTransactions()).containsExactly(empty, anonymous);
        assertThat(withProblems.allTransactionsAreValid()).isFalse();
    }

    @Test
    void shouldRecogniseWhenAllTransactionsAreValid() {
        assertThat(analyser.invalidTransactions()).isEmpty();
        assertThat(analyser.allTransactionsAreValid()).isTrue();
    }
}
