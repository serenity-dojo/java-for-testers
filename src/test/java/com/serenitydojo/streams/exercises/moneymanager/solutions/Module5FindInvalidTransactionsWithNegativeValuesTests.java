package com.serenitydojo.streams.exercises.moneymanager.solutions;
import static com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity.trx;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.testng.annotations.Test;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionChecker;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity;

public class Module5FindInvalidTransactionsWithNegativeValuesTests {
	
	static {
       System.out.println("\nChecking for invalid transactions");
       System.out.println("\nTask 5.2: Check for the presence transactions with negative value");
    }
	
	
    @Test
    void whenADepositIsNegative() {
    System.out.println("\nWhen a deposit is negative");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(trx("Dry Cleaning", "Laundry Inc", 0, -5, 10.0) );

    assertThat(TransactionChecker.from(transactionFeed).hasInvalidTransactions()).isTrue();
    System.out.println("\nTC-01 - whenADepositIsNegative() - Executed successfully.");
    }

    
    @Test
    void whenAWithdrawlIsNegative() {
    System.out.println("\nWhen a withdrawal is negative");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of( trx("Dry Cleaning", "Laundry Inc", -5.0, 0, 10.0) );

    assertThat(TransactionChecker.from(transactionFeed).hasInvalidTransactions()).isTrue();
    System.out.println("\nTC-02 - whenAWithdrawlIsNegative() - Executed successfully.");
    }
    
    
}