package com.serenitydojo.streams.exercises.moneymanager.solutions;
import static com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity.trx;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;
import org.testng.annotations.Test;
import com.serenitydojo.streams.exercises.moneymanager.domain.MinMaxTransactions;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity;

public class Module2FindTheSmallestDepositTests {
	
	static {
       System.out.println("\nCalculate minimum and maximum deposits and withdrawals in a feed");
       System.out.println("\nTask 1: Find the smallest deposit");
    }
	
	
    @Test
    void forNoTransactions() {
    System.out.println("\nWhen there are no transactions.");
    List<TransactionFeedEntryEntity> transactionFeedEntries = new ArrayList<>();
    Stream<TransactionFeedEntryEntity> transactionFeed = transactionFeedEntries.stream();

    assertThat(MinMaxTransactions.from(transactionFeed).getSmallestDeposit().isPresent()).isFalse();
    System.out.println("\nTC-01 - forNoTransactions() - Executed successfully.");
    }

    
    @Test
    void forOneWithdrawal() {
    System.out.println("\nWhen there is a single withdrawal");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(trx("Coffee", "Coffee and Co", 10.0, 0, 10.0));
    OptionalDouble smallestDeposit = MinMaxTransactions.from(transactionFeed).getSmallestDeposit();
    
    assertThat(smallestDeposit.isPresent()).isFalse();
    System.out.println("\nTC-02 - forOneWithdrawal() - Executed successfully.");
    }

    
    @Test
    void forOneDeposit() {
    System.out.println("\nWhen there is a single deposit");
    Stream<TransactionFeedEntryEntity> transactionFeed =Stream.of(trx("Salary May", "Coffee and Co", 0, 500, 500));
    OptionalDouble smallestDeposit = MinMaxTransactions.from(transactionFeed).getSmallestDeposit();
    
    assertThat(smallestDeposit.isPresent()).isTrue();
    assertThat(smallestDeposit.getAsDouble()).isEqualTo(500.0);
    System.out.println("\nTC-03 - forOneDeposit() - Executed successfully.");
    }

    
    @Test
    void forManyDeposit() {
    System.out.println("\nWhen there are many deposits");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee Macbine", "Coffee and Co", 1000.0, 0, 10.0),
                        trx("Salary May", "Coffee and Co", 0, 500, 500),
                        trx("Salary June", "Coffee and Co", 0, 800, 500)
                );
    OptionalDouble smallestDeposit = MinMaxTransactions.from(transactionFeed).getSmallestDeposit();
    
    assertThat(smallestDeposit.isPresent()).isTrue();
    assertThat(smallestDeposit.getAsDouble()).isEqualTo(500.0);
    System.out.println("\nTC-04 - forManyDeposit() - Executed successfully.");
    }
	
}