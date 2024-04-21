package com.serenitydojo.streams.exercises.moneymanager.domain;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TransactionChecker {

	private Stream<TransactionFeedEntryEntity> transactionFeed;
    private final Predicate<TransactionFeedEntryEntity> HAS_ZERO_VALUE = (entry -> entry.getDeposit() == 0 && entry.getWithdrawal() == 0);
    private final Predicate<TransactionFeedEntryEntity> HAS_NEGATIVE_VALUES= (entry -> entry.getDeposit() < 0 || entry.getWithdrawal() < 0);
    private final Predicate<TransactionFeedEntryEntity> HAS_MISSING_COUNTERPARTY= (entry -> entry.getCounterparty() == null || entry.getCounterparty().trim().isEmpty());

	private TransactionChecker(Stream<TransactionFeedEntryEntity> transactionFeed) {
		this.transactionFeed = transactionFeed;
	}

	public static TransactionChecker from(Stream<TransactionFeedEntryEntity> transactionFeed) {
		return new TransactionChecker(transactionFeed);
	}
	
    private final List<Predicate<TransactionFeedEntryEntity>> RULES = Arrays.asList (
            HAS_ZERO_VALUE, HAS_NEGATIVE_VALUES, HAS_MISSING_COUNTERPARTY
    );

    public boolean hasInvalidTransactions() {
        return transactionFeed.anyMatch(this::violatesConstraints);
    }

    private boolean violatesConstraints(TransactionFeedEntryEntity entry) {
        return RULES.stream().anyMatch(
                rule -> rule.test(entry)
        );
    }
	
}