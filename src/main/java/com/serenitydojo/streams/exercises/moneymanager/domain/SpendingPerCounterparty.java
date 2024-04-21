package com.serenitydojo.streams.exercises.moneymanager.domain;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpendingPerCounterparty {
	
	private Stream<TransactionFeedEntryEntity> transactionFeed;

	private SpendingPerCounterparty(Stream<TransactionFeedEntryEntity> transactionFeed) {
		this.transactionFeed = transactionFeed;
	}
	
    public static SpendingPerCounterparty from(Stream<TransactionFeedEntryEntity> transactionFeed) {
    return new SpendingPerCounterparty(transactionFeed);
    }

    public List<String> getCounterparties() {
    return transactionFeed.filter(TransactionFeedEntryEntity::isWithdrawl)
                          .map(TransactionFeedEntryEntity::getCounterparty)
                          .distinct()
                          .sorted()
                          .collect(Collectors.toList());
    }

    public List<TransactionFeedEntryEntity> getPurchasesFrom(String counterParty) {
    return transactionFeed.filter(entry -> entry.getCounterparty().equals(counterParty))
                          .collect(Collectors.toList());
    }

    public double getTotalSpendingFor(String counterParty) {
    return transactionFeed.filter(entry -> entry.getCounterparty().equals(counterParty))
                          .mapToDouble(entry -> entry.getWithdrawal() - entry.getDeposit() )
                          .sum();
    }
    
}