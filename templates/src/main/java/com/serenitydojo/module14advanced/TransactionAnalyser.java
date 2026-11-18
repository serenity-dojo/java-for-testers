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
//@@ solution
        return transactions.stream().count();
//@@ starter
        // TODO: use stream().count()
        return 0;
//@@ end
    }

    /**
     * The total of all the amounts (deposits minus withdrawals).
     */
    public double balance() {
//@@ solution
        return transactions.stream().mapToDouble(Transaction::amount).sum();
//@@ starter
        // TODO: use stream().mapToDouble(...).sum()
        return 0;
//@@ end
    }

    /**
     * The total value of all the deposits.
     */
    public double totalDeposits() {
//@@ solution
        return transactions.stream()
                .filter(Transaction::isDeposit)
                .mapToDouble(Transaction::amount)
                .sum();
//@@ starter
        // TODO: filter the deposits, then add them up
        return 0;
//@@ end
    }

    /**
     * The deposit with the highest amount, if there are any deposits.
     */
    public Optional<Transaction> largestDeposit() {
//@@ solution
        return transactions.stream()
                .filter(Transaction::isDeposit)
                .max(Comparator.comparingDouble(Transaction::amount));
//@@ starter
        // TODO: filter the deposits, then find the max using Comparator.comparingDouble(...)
        return Optional.empty();
//@@ end
    }

    /**
     * The withdrawal that took out the most money, if there are any withdrawals.
     */
    public Optional<Transaction> largestWithdrawal() {
//@@ solution
        return transactions.stream()
                .filter(Transaction::isWithdrawal)
                .min(Comparator.comparingDouble(Transaction::amount));
//@@ starter
        // TODO: filter the withdrawals, then find the one with the lowest (most negative) amount
        return Optional.empty();
//@@ end
    }

    /**
     * The transactions where the amount, whether it is a deposit or a withdrawal, is larger than the threshold.
     */
    public List<Transaction> transactionsLargerThan(double threshold) {
//@@ solution
        return transactions.stream()
                .filter(transaction -> Math.abs(transaction.amount()) > threshold)
                .collect(Collectors.toList());
//@@ starter
        // TODO: filter by the absolute value of the amount (Math.abs), then collect the result into a list
        return List.of();
//@@ end
    }

    /**
     * The transactions with a particular counterparty.
     */
    public List<Transaction> transactionsWith(String counterparty) {
//@@ solution
        return transactions.stream()
                .filter(transaction -> transaction.counterparty().equals(counterparty))
                .collect(Collectors.toList());
//@@ starter
        // TODO: filter by counterparty
        return List.of();
//@@ end
    }

    /**
     * The names of all the counterparties, without duplicates, in alphabetical order.
     */
    public List<String> counterparties() {
//@@ solution
        return transactions.stream()
                .map(Transaction::counterparty)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
//@@ starter
        // TODO: map to the counterparty names, then use distinct() and sorted()
        return List.of();
//@@ end
    }

    /**
     * The total amount for each counterparty (deposits minus withdrawals).
     */
    public Map<String, Double> balancePerCounterparty() {
//@@ solution
        return transactions.stream()
                .collect(Collectors.groupingBy(Transaction::counterparty,
                        Collectors.summingDouble(Transaction::amount)));
//@@ starter
        // TODO: use Collectors.groupingBy(...) together with Collectors.summingDouble(...)
        return Map.of();
//@@ end
    }

    /**
     * The transactions which are not valid: they have an amount of zero, or a counterparty that is blank.
     */
    public List<Transaction> invalidTransactions() {
//@@ solution
        return transactions.stream()
                .filter(transaction -> transaction.amount() == 0 || transaction.counterparty().isBlank())
                .collect(Collectors.toList());
//@@ starter
        // TODO: filter the transactions that have a zero amount or a blank counterparty
        return List.of();
//@@ end
    }

    /**
     * True if every transaction has a counterparty and a non-zero amount.
     */
    public boolean allTransactionsAreValid() {
//@@ solution
        return transactions.stream()
                .allMatch(transaction -> transaction.amount() != 0 && !transaction.counterparty().isBlank());
//@@ starter
        // TODO: use allMatch(...)
        return false;
//@@ end
    }
}
