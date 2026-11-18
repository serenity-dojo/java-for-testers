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
        return transactions.stream().count();
    }

    /**
     * The total of all the amounts (deposits minus withdrawals).
     */
    public double balance() {
        return transactions.stream().mapToDouble(Transaction::amount).sum();
    }

    /**
     * The total value of all the deposits.
     */
    public double totalDeposits() {
        return transactions.stream()
                .filter(Transaction::isDeposit)
                .mapToDouble(Transaction::amount)
                .sum();
    }

    /**
     * The deposit with the highest amount, if there are any deposits.
     */
    public Optional<Transaction> largestDeposit() {
        return transactions.stream()
                .filter(Transaction::isDeposit)
                .max(Comparator.comparingDouble(Transaction::amount));
    }

    /**
     * The withdrawal that took out the most money, if there are any withdrawals.
     */
    public Optional<Transaction> largestWithdrawal() {
        return transactions.stream()
                .filter(Transaction::isWithdrawal)
                .min(Comparator.comparingDouble(Transaction::amount));
    }

    /**
     * The transactions where the amount, whether it is a deposit or a withdrawal, is larger than the threshold.
     */
    public List<Transaction> transactionsLargerThan(double threshold) {
        return transactions.stream()
                .filter(transaction -> Math.abs(transaction.amount()) > threshold)
                .collect(Collectors.toList());
    }

    /**
     * The transactions with a particular counterparty.
     */
    public List<Transaction> transactionsWith(String counterparty) {
        return transactions.stream()
                .filter(transaction -> transaction.counterparty().equals(counterparty))
                .collect(Collectors.toList());
    }

    /**
     * The names of all the counterparties, without duplicates, in alphabetical order.
     */
    public List<String> counterparties() {
        return transactions.stream()
                .map(Transaction::counterparty)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * The total amount for each counterparty (deposits minus withdrawals).
     */
    public Map<String, Double> balancePerCounterparty() {
        return transactions.stream()
                .collect(Collectors.groupingBy(Transaction::counterparty,
                        Collectors.summingDouble(Transaction::amount)));
    }

    /**
     * The transactions which are not valid: they have an amount of zero, or a counterparty that is blank.
     */
    public List<Transaction> invalidTransactions() {
        return transactions.stream()
                .filter(transaction -> transaction.amount() == 0 || transaction.counterparty().isBlank())
                .collect(Collectors.toList());
    }

    /**
     * True if every transaction has a counterparty and a non-zero amount.
     */
    public boolean allTransactionsAreValid() {
        return transactions.stream()
                .allMatch(transaction -> transaction.amount() != 0 && !transaction.counterparty().isBlank());
    }
}
