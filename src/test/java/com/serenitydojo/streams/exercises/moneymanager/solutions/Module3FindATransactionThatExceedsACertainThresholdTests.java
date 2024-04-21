package com.serenitydojo.streams.exercises.moneymanager.solutions;
import static com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity.trx;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.testng.annotations.Test;
import com.serenitydojo.streams.exercises.moneymanager.domain.FindASampleTransaction;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity;

public class Module3FindATransactionThatExceedsACertainThresholdTests {
	
	List<TransactionFeedEntryEntity> NO_TRANSACTIONS = new ArrayList<>();
	
	static {
       System.out.println("\nFinding sample transactions");
       System.out.println("\nTask 3.1: Find an example of a transaction above a certain amount.");
    }
	
	
    @Test
    void forNoTransactions() {
    System.out.println("\nWhen there are no transactions at all");
    assertThat(FindASampleTransaction.from(NO_TRANSACTIONS.stream()).thatExceed(10.0).isPresent()).isFalse();
    System.out.println("\nTC-01 - forNoTransactions() - Executed successfully.");
    }

    
    @Test
    void whereThereIsAMatchingDeposit() {
    System.out.println("\nWhen there is one matching deposit");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Salary", "Employers Inc", 0, 1000, 1990),
                        trx("Oyster Card", "TFL", 25.0, 0, 10.0),
                        trx("Dry Cleaning", "Laundry Inc", 5.0, 0, 10.0)
                );

    assertThat(FindASampleTransaction.from(transactionFeed).thatExceed(100).get().getDeposit()).isEqualTo(1000);
    System.out.println("\nTC-02 - whereThereIsAMatchingDeposit() - Executed successfully.");
    }


    @Test
    void whereThereIsAMatchingWithdrawal() {
    System.out.println("\nWhen there is one matching withdrawal");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 15.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 5.0, 0, 10.0)
                );

    assertThat(FindASampleTransaction.from(transactionFeed).thatExceed(12).get().getWithdrawal()).isEqualTo(15);
    System.out.println("\nTC-03 - whereThereIsAMatchingWithdrawal() - Executed successfully.");
    }

    
    @Test
    void whereThereAreAMatchingWithdrawalsAndDeposits() {
    System.out.println("\nWhen there is one matching withdrawal");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Salary", "Employers Inc", 0, 1000, 1990),
                        trx("Oyster Card", "TFL", 25.0, 0, 10.0),
                        trx("Dry Cleaning", "Laundry Inc", 5.0, 0, 10.0)
                );

    assertThat(FindASampleTransaction.from(transactionFeed).thatExceed(12).get().getDeposit()).isEqualTo(1000);
    System.out.println("\nTC-04 - whereThereAreAMatchingWithdrawalsAndDeposits() - Executed successfully.");
    }
	
}