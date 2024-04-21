package com.serenitydojo.streams.exercises.moneymanager.solutions;
import static com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity.trx;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.testng.annotations.Test;
import com.serenitydojo.streams.exercises.moneymanager.domain.SpendingPerCounterparty;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity;

public class Module4FindAllTheCounterpartiesTests {
	
	List<TransactionFeedEntryEntity> NO_TRANSACTIONS = new ArrayList<>();
	
	static {
       System.out.println("\nCalculate spending per counterparty");
       System.out.println("\nTask 4.1: Find the list of counterparties.");
    }
	
	
    @Test
    void forNoTransactions() {
    System.out.println("\nWhen there are no transactions");
    assertThat(SpendingPerCounterparty.from(NO_TRANSACTIONS.stream()).getCounterparties()).isEmpty();
    System.out.println("\nTC-01 - forNoTransactions() - Executed successfully.");
    }

    
    @Test
    void forTransactionsFromOneCounterparty() {
    System.out.println("\nWhen there is one counterparty");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 15.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 5.0, 0, 10.0)
                );

    assertThat(SpendingPerCounterparty.from(transactionFeed).getCounterparties()).containsExactly("Coffee and Co");
    System.out.println("\nTC-02 - forTransactionsFromOneCounterparty() - Executed successfully.");
    }

    
    @Test
    void forTransactionsFromSeveralCounterparty() {
    System.out.println("\nWhen there are several counterparties");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Oyster Card", "TFL", 25.0, 0, 10.0),
                        trx("Dry Cleaning", "Laundry Inc", 5.0, 0, 10.0)
                );

    assertThat(SpendingPerCounterparty.from(transactionFeed).getCounterparties()).containsExactly("Coffee and Co", "Laundry Inc", "TFL");
    System.out.println("\nTC-03 - forTransactionsFromSeveralCounterparty() - Executed successfully.");
    }
	
}