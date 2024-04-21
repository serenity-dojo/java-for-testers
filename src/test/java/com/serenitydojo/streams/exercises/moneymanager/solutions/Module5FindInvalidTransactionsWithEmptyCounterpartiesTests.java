package com.serenitydojo.streams.exercises.moneymanager.solutions;
import static com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity.trx;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.testng.annotations.Test;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionChecker;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity;

public class Module5FindInvalidTransactionsWithEmptyCounterpartiesTests {
	
	static {
       System.out.println("\nChecking for invalid transactions");
       System.out.println("\nTask 5.3: Check for the presence transactions with no counterparty");
    }
	
	
    @Test
    void whenADepositIsNegative() {
    System.out.println("\nWhen a counterparty is empty");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of( trx("Dry Cleaning", "", 0, 5, 10.0) );

    assertThat(TransactionChecker.from(transactionFeed).hasInvalidTransactions()).isTrue();
    System.out.println("\nTC-01 - whenADepositIsNegative() - Executed successfully.");
    }

    
    @Test
    void whenACounterpartyIsBlank() {
    System.out.println("\nWhen a counterparty is blank");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of( trx("Dry Cleaning", "   ", 0, 5, 10.0) );

    assertThat(TransactionChecker.from(transactionFeed).hasInvalidTransactions()).isTrue();
    System.out.println("\nTC-02 - whenACounterpartyIsBlank() - Executed successfully.");
    }
    
    
    @Test
    void whenACounterpartyIsNull() {
    System.out.println("\nWhen a counterparty is null");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of( trx("Dry Cleaning", null, 0, 5, 10.0) );

    assertThat(TransactionChecker.from(transactionFeed).hasInvalidTransactions()).isTrue();
    System.out.println("\nTC-03 - whenACounterpartyIsNull() - Executed successfully.");
    }
    
    
}