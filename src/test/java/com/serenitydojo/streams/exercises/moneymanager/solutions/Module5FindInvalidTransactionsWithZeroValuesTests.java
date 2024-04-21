package com.serenitydojo.streams.exercises.moneymanager.solutions;
import static com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity.trx;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.testng.annotations.Test;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionChecker;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity;

public class Module5FindInvalidTransactionsWithZeroValuesTests {
	
	List<TransactionFeedEntryEntity> NO_TRANSACTIONS = new ArrayList<>();
	 
	static {
       System.out.println("\nChecking for invalid transactions");
       System.out.println("\nTask 5.1: Check for the presence transactions with zero value");
    }
	
	
    @Test
    void forNoTransactions() {
    System.out.println("\nWhen there are no transactions");
    assertThat(TransactionChecker.from(NO_TRANSACTIONS.stream()).hasInvalidTransactions()).isFalse();
    System.out.println("\nTC-01 - forNoTransactions() - Executed successfully.");
    }

    
    @Test
    void forTransactionsFromOneCounterparty() {
    System.out.println("\nWhen all the transactions are correct");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 50.0),
                        trx("Oyster Card", "TFL", 25.0, 0, 40.0),
                        trx("Dry Cleaning", "Laundry Inc", 5.0, 0, 30.0)
                );

    assertThat(TransactionChecker.from(transactionFeed).hasInvalidTransactions()).isFalse();
    System.out.println("\nTC-02 - forTransactionsFromOneCounterparty() - Executed successfully.");
    }

    
    @Test
    void forTransactionsFromSeveralCounterparty() {
    System.out.println("\nWhen there is a transaction with a value of zero");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Oyster Card", "TFL", 0, 0, 10.0),
                        trx("Dry Cleaning", "Laundry Inc", 5.0, 0, 10.0)
                );

    assertThat(TransactionChecker.from(transactionFeed).hasInvalidTransactions()).isTrue();
    System.out.println("\nTC-03 - forTransactionsFromSeveralCounterparty() - Executed successfully.");
    }
    
}