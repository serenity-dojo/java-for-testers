package com.serenitydojo.streams.exercises.moneymanager.solutions;
import static com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity.trx;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.testng.annotations.Test;
import com.serenitydojo.streams.exercises.moneymanager.domain.CountTransactions;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity;

public class Module1FindTheVolumeOfTransactionsTests {
	
	static {
       System.out.println("\nCalculate total values of transactions in a feed");
       System.out.println("\nTask 1.2: Find the volume of all transactions");
    }
	
	
    @Test
    void forDebits() {
    System.out.println("\nWhen there are lots of debits");
    Stream<TransactionFeedEntryEntity> transactionFeed =
                Stream.of(trx("Coffee", "Coffee and co", 10.0, 0, 990.0),
                        trx("Gas", "Gas Company", 100, 0, 890),
                        trx("Taxi", "Taxis R Us", 15.0, 0, 875));

    assertThat(CountTransactions.from(transactionFeed).getTransactionVolume()).isEqualTo(125);
    System.out.println("\nTC-01 - forDebits() - Executed successfully.");
    }


    @Test
    void forDebitsAndCredits() {
    System.out.println("\nWhen there are debits and credits");
    Stream<TransactionFeedEntryEntity> transactionFeed =
                Stream.of(trx("Coffee", "Coffee and co", 10.0, 0, 990),
                        trx("Salary", "Employers Inc", 0, 1000, 1990),
                        trx("Taxi", "Taxis R Us", 15.0, 0, 1975));

    assertThat(CountTransactions.from(transactionFeed).getTransactionVolume()).isEqualTo(1025);
    System.out.println("\nTC-02 - forDebitsAndCredits() - Executed successfully.");
    }
	
}