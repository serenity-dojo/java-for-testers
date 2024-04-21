package com.serenitydojo.streams.exercises.moneymanager.solutions;
import static com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity.trx;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.testng.annotations.Test;
import com.serenitydojo.streams.exercises.moneymanager.domain.FindASampleTransaction;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity;

public class Module3FindATransactionThatExceedsACertainThresholdForAGivenCounterpartyTests {
	
	List<TransactionFeedEntryEntity> NO_TRANSACTIONS = new ArrayList<>();
	
	static {
       System.out.println("\nFinding sample transactions");
       System.out.println("\nTask 3.2: Find an example of a transaction above a certain amount for a given counterparty.");
    }
	
	
    @Test
    void forNoTransactions() {
    System.out.println("\nWhen there are no transactions at all");
    assertThat(FindASampleTransaction.from(NO_TRANSACTIONS.stream())
               .forACounterpartyThatExceed("Coffee and Co",10.0).isPresent())
               .isFalse();
    System.out.println("\nTC-01 - forNoTransactions() - Executed successfully.");
    }

    
    @Test
    void whereThereIsNoMatchingDeposit() {
    System.out.println("\nWhen there no one matching deposit.");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Salary", "Employers Inc", 0, 1000, 1990),
                        trx("Oyster Card", "TFL", 25.0, 0, 10.0),
                        trx("Dry Cleaning", "Laundry Inc", 5.0, 0, 10.0)
                );
    
    assertThat(FindASampleTransaction.from(transactionFeed).forACounterpartyThatExceed("TFL",100).isPresent()).isFalse();
    System.out.println("\nTC-02 - whereThereIsNoMatchingDeposit() - Executed successfully.");
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

    assertThat(FindASampleTransaction.from(transactionFeed).forACounterpartyThatExceed("TFL",20).get().getWithdrawal()).isEqualTo(25);
    System.out.println("\nTC-03 - whereThereIsAMatchingDeposit() - Executed successfully.");
    }


    @Test
    void whereThereIsAMatchingWithdrawal() {
    System.out.println("When there are multiple matching withdrawals");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Oyster Card", "TFL", 5.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 15.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 5.0, 0, 10.0)
                );

    assertThat(FindASampleTransaction.from(transactionFeed).forACounterpartyThatExceed("Coffee and Co",12).get().getWithdrawal()).isEqualTo(15);
    System.out.println("\nTC-04 - whereThereIsAMatchingWithdrawal() - Executed successfully.");
    }
	
}