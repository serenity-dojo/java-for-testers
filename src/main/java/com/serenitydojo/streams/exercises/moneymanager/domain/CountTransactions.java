package com.serenitydojo.streams.exercises.moneymanager.domain;
import java.util.stream.Stream;

public class CountTransactions {

	private Stream<TransactionFeedEntryEntity> transactionFeed;

	private CountTransactions(Stream<TransactionFeedEntryEntity> transactionFeed) {
		this.transactionFeed = transactionFeed;
	}

	public static CountTransactions from(Stream<TransactionFeedEntryEntity> transactionFeed) {
		return new CountTransactions(transactionFeed);
	}

	public long getNumberOfTransactions() {
		return transactionFeed.count();
	}

	public double getTransactionVolume() {
		return transactionFeed.mapToDouble(this::volumeOf).sum();
	}

	public double getTotalTransactions() {
		return transactionFeed.mapToDouble(this::totalOf).sum();
	}

	private double volumeOf(TransactionFeedEntryEntity transaction) {
		return transaction.getDeposit() + transaction.getWithdrawal();
	}

	private double totalOf(TransactionFeedEntryEntity transaction) {
		return transaction.getDeposit() - transaction.getWithdrawal();
	}
}