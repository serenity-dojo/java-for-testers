package com.serenitydojo.module14advanced;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Exercise 14.2: Working with streams.
 * <p>
 * Implement each method using the Stream API (list.stream()), not with loops.
 */
public class TransactionAnalyser {
    private final List<Transaction> transactions;

    public TransactionAnalyser(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    /**
     * The number of transactions.
     */
    public long numberOfTransactions() {
        // TODO: use stream().count()
        return 0;
    }

    /**
     * The total of all the amounts (deposits minus withdrawals).
     */
    public double balance() {
        // TODO: use stream().mapToDouble(...).sum()
        return 0;
    }

    /**
     * The total value of all the deposits.
     */
    public double totalDeposits() {
        // TODO: filter the deposits, then add them up
        return 0;
    }

    /**
     * The deposit with the highest amount, if there are any deposits.
     */
    public Optional<Transaction> largestDeposit() {
        // TODO: filter the deposits, then find the max using Comparator.comparingDouble(...)
        return Optional.empty();
    }

    /**
     * The withdrawal that took out the most money, if there are any withdrawals.
     */
    public Optional<Transaction> largestWithdrawal() {
        // TODO: filter the withdrawals, then find the one with the lowest (most negative) amount
        return Optional.empty();
    }

    /**
     * The transactions where the amount, whether it is a deposit or a withdrawal, is larger than the threshold.
     */
    public List<Transaction> transactionsLargerThan(double threshold) {
        // TODO: filter by the absolute value of the amount (Math.abs), then collect the result into a list
        return List.of();
    }

    /**
     * The transactions with a particular counterparty.
     */
    public List<Transaction> transactionsWith(String counterparty) {
        // TODO: filter by counterparty
        return List.of();
    }

    /**
     * The names of all the counterparties, without duplicates, in alphabetical order.
     */
    public List<String> counterparties() {
        // TODO: map to the counterparty names, then use distinct() and sorted()
        return List.of();
    }

    /**
     * The total amount for each counterparty (deposits minus withdrawals).
     */
    public Map<String, Double> balancePerCounterparty() {
        // TODO: use Collectors.groupingBy(...) together with Collectors.summingDouble(...)
        return Map.of();
    }

    /**
     * The transactions which are not valid: they have an amount of zero, or a counterparty that is blank.
     */
    public List<Transaction> invalidTransactions() {
        // TODO: filter the transactions that have a zero amount or a blank counterparty
        return List.of();
    }

    /**
     * True if every transaction has a counterparty and a non-zero amount.
     */
    public boolean allTransactionsAreValid() {
        // TODO: use allMatch(...)
        return false;
    }
}
