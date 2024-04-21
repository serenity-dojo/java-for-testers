package com.serenitydojo.streams.exercises.moneymanager.domain;
import java.util.Optional;
import java.util.stream.Stream;

public class FindASampleTransaction {

	private Stream<TransactionFeedEntryEntity> transactionFeed;

	private FindASampleTransaction(Stream<TransactionFeedEntryEntity> transactionFeed) {
		this.transactionFeed = transactionFeed;
	}

	public static FindASampleTransaction from(Stream<TransactionFeedEntryEntity> transactionFeed) {
		return new FindASampleTransaction(transactionFeed);
	}

	public Optional<TransactionFeedEntryEntity> thatExceed(double amount) {
    return transactionFeed.filter(entry -> entry.getDeposit() > amount || entry.getWithdrawal() > amount)
				          .findFirst();
	}

	public Optional<TransactionFeedEntryEntity> forACounterpartyThatExceed(String counterParty, double amount) {
	return transactionFeed.filter(entry -> entry.getCounterparty().equals(counterParty))
				          .filter(entry -> entry.getDeposit() > amount || entry.getWithdrawal() > amount)
				          .findFirst();
	}

}