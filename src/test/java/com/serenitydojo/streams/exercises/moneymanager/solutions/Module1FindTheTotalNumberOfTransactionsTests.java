package com.serenitydojo.streams.exercises.moneymanager.solutions;
import static com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity.trx;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.testng.annotations.Test;
import com.serenitydojo.streams.exercises.moneymanager.domain.CountTransactions;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity;

public class Module1FindTheTotalNumberOfTransactionsTests {
	
	static {
       System.out.println("\nCalculate total values of transactions in a feed");
       System.out.println("\nTask 1.1: Find the total number of transactions");
    }

	
    @Test
    void forNoTransactions() {
    System.out.println("\nWhen there are no transactions");
    List<TransactionFeedEntryEntity> transactionFeedEntries = new ArrayList<>();
    Stream<TransactionFeedEntryEntity> transactionFeed = transactionFeedEntries.stream();
    long numberOfTransactions = CountTransactions.from(transactionFeed).getNumberOfTransactions();
    
    assertThat(numberOfTransactions).isEqualTo(0);
    System.out.println("\nTC-01 - forNoTransactions() - Executed successfully.");
    }

    
    @Test
    void forOneTransaction() {
    System.out.println("\nWhen there is a single transaction");
    Stream<TransactionFeedEntryEntity> transactionFeed =
                Stream.of(trx("Coffee", "Coffee and Co", 10.0, 0, 10.0));
    long numberOfTransactions = CountTransactions.from(transactionFeed).getNumberOfTransactions();
    
    assertThat(numberOfTransactions).isEqualTo(1);
    System.out.println("\nTC-02 - forOneTransaction() - Executed successfully.");
    }

    
    @Test
    void forManyTransactions() {
    System.out.println("\nWhen there are several transactions");
    Stream<TransactionFeedEntryEntity> transactionFeed =
                Stream.of(trx("Coffee", "Coffee and Co", 10.0, 0, 100.0),
                        trx("Taxi", "Taxis R Us", 15.0, 0, 85));
    long numberOfTransactions = CountTransactions.from(transactionFeed).getNumberOfTransactions();
    
    assertThat(numberOfTransactions).isEqualTo(2);
    System.out.println("\nTC-03 - forManyTransactions() - Executed successfully.");
    }
	
}