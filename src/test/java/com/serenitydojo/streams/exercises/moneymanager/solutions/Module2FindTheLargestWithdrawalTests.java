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

public class Module2FindTheLargestWithdrawalTests {
	
	static {
       System.out.println("\nCalculate minimum and maximum deposits and withdrawals in a feed");
       System.out.println("\nTask 4: Find the largest withdrawal");
    }
	
	
    @Test
    void forNoTransactions() {
    System.out.println("When there are no transactions");
    List<TransactionFeedEntryEntity> transactionFeedEntries = new ArrayList<>();
    Stream<TransactionFeedEntryEntity> transactionFeed = transactionFeedEntries.stream();

    assertThat(MinMaxTransactions.from(transactionFeed).getLargestWithdrawal().isPresent()).isFalse();
    System.out.println("\nTC-01 - forNoTransactions() - Executed successfully.");
    }

    
    @Test
    void forOneWithdrawal() {
    System.out.println("\nWhen there is a single deposit");
    Stream<TransactionFeedEntryEntity> transactionFeed =Stream.of(trx("Salary May", "Coffee and Co", 0, 500, 500));
    OptionalDouble smallestWithdrawal= MinMaxTransactions.from(transactionFeed).getLargestWithdrawal();
    
    assertThat(smallestWithdrawal.isPresent()).isFalse();
    System.out.println("\nTC-02 - forOneWithdrawal() - Executed successfully.");
    }

    
    @Test
    void forOneDeposit() {
    System.out.println("\nWhen there is a single withdrawal");
    Stream<TransactionFeedEntryEntity> transactionFeed =Stream.of(trx("Coffee", "Coffee and Co", 10.0, 0, 10.0));
    OptionalDouble smallestWithdrawal = MinMaxTransactions.from(transactionFeed).getLargestWithdrawal();
    
    assertThat(smallestWithdrawal.isPresent()).isTrue();
    assertThat(smallestWithdrawal.getAsDouble()).isEqualTo(10.0);
    System.out.println("\nTC-03 - forOneDeposit() - Executed successfully.");
    }

    
    @Test
    void forManyDeposit() {
    System.out.println("\nWhen there are many withdrawals");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 5.0, 0, 10.0),
                        trx("Newspapers", "Corner Shop", 10.0, 0, 10.0),
                        trx("Salary May", "Coffee and Co", 0, 500, 500),
                        trx("Salary June", "Coffee and Co", 0, 800, 500)
                );
    OptionalDouble smallestWithdrawal = MinMaxTransactions.from(transactionFeed).getLargestWithdrawal();
    
    assertThat(smallestWithdrawal.isPresent()).isTrue();
    assertThat(smallestWithdrawal.getAsDouble()).isEqualTo(10.0);
    System.out.println("\nTC-04 - forManyDeposit() - Executed successfully.");
    }
	
}