package com.serenitydojo.streams.exercises.moneymanager.solutions;
import static com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity.trx;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.testng.annotations.Test;
import com.serenitydojo.streams.exercises.moneymanager.domain.MinMaxTransactions;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity;

public class Module2FindTheLargestTransactionTests {
	
	static {
       System.out.println("\nCalculate minimum and maximum deposits and withdrawals in a feed");
       System.out.println("\nTask 5: Find the largest overall transaction");
    }
	
	
    @Test
    void forNoTransactions() {
    System.out.println("\nWhen there are no transactions");
    List<TransactionFeedEntryEntity> transactionFeedEntries = new ArrayList<>();
    Stream<TransactionFeedEntryEntity> transactionFeed = transactionFeedEntries.stream();

    assertThat(MinMaxTransactions.from(transactionFeed).getLargestTransaction().isPresent()).isFalse();
    System.out.println("\nTC-01 - forNoTransactions() - Executed successfully.");
    }

    
    @Test
    void whenTheLargestIsAWidtdrawal() {
    System.out.println("\nWhen the largest transaction is a withdrawal we should get a negative value");
    Stream<TransactionFeedEntryEntity> transactionFeed =Stream.of(
                        trx("Coffee Machine", "Coffee and Co", 1200, 0, 10.0),
                        trx("Newspapers", "Corner Shop", 10.0, 0, 10.0),
                        trx("Salary May", "Coffee and Co", 0, 500, 500),
                        trx("Salary June", "Coffee and Co", 0, 800, 500)
                );
    Optional<Double> smallestWithdrawal = MinMaxTransactions.from(transactionFeed).getLargestTransaction();
    
    assertThat(smallestWithdrawal.isPresent()).isTrue();
    assertThat(smallestWithdrawal.get()).isEqualTo(-1200.0);
    System.out.println("\nTC-02 - whenTheLargestIsAWidtdrawal() - Executed successfully.");
    }

    
    @Test
    void whenTheLargestIsADeposit() {
    System.out.println("\nWhen the largest transaction is a deposit we should get a positive value");
    Stream<TransactionFeedEntryEntity> transactionFeed =Stream.of(
                        trx("Coffee", "Coffee and Co", 5.0, 0, 10.0),
                        trx("Newspapers", "Corner Shop", 10.0, 0, 10.0),
                        trx("Salary May", "Coffee and Co", 0, 500, 500),
                        trx("Salary June", "Coffee and Co", 0, 800, 500)
                );
    Optional<Double> smallestWithdrawal = MinMaxTransactions.from(transactionFeed).getLargestTransaction();
    
    assertThat(smallestWithdrawal.isPresent()).isTrue();
    assertThat(smallestWithdrawal.get()).isEqualTo(800.0);
    System.out.println("\nTC-03 - whenTheLargestIsADeposit() - Executed successfully.");
    }
	
}