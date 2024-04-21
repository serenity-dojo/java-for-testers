package com.serenitydojo.streams.exercises.moneymanager.domain;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class MinMaxTransactions {
	
	private Stream<TransactionFeedEntryEntity> transactionFeed;

	private MinMaxTransactions(Stream<TransactionFeedEntryEntity> transactionFeed) {
		this.transactionFeed = transactionFeed;
	}
	
    public static MinMaxTransactions from(Stream<TransactionFeedEntryEntity> transactionFeed) {
        return new MinMaxTransactions(transactionFeed);
    }

    public OptionalDouble getSmallestDeposit() {
    return transactionFeed.filter(TransactionFeedEntryEntity::isDeposit)
                              .mapToDouble(TransactionFeedEntryEntity::getDeposit)
                              .min();
    }

    public OptionalDouble getLargestDeposit() {
    return transactionFeed.filter(TransactionFeedEntryEntity::isDeposit)
    		              .mapToDouble(TransactionFeedEntryEntity::getDeposit)
    		              .max();
    }

    public Optional<Double> getLargestTransaction() {
    return transactionFeed.map(entry -> (entry.isDeposit() ? entry.getDeposit() : entry.getWithdrawal() * -1))
                          .max(Comparator.comparingDouble(Math::abs));
    }

    public OptionalDouble getSmallestWithdrawal() {
    return transactionFeed.filter(TransactionFeedEntryEntity::isWithdrawl)
                          .mapToDouble(TransactionFeedEntryEntity::getWithdrawal)
                          .min();
    }

    public OptionalDouble getLargestWithdrawal() {
    return transactionFeed.filter(TransactionFeedEntryEntity::isWithdrawl)
                          .mapToDouble(TransactionFeedEntryEntity::getWithdrawal)
                          .max();
    }

}