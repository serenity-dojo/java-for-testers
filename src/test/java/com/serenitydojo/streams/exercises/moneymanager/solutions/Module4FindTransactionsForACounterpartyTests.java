package com.serenitydojo.streams.exercises.moneymanager.solutions;
import static com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity.trx;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.testng.annotations.Test;
import com.serenitydojo.streams.exercises.moneymanager.domain.SpendingPerCounterparty;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity;

public class Module4FindTransactionsForACounterpartyTests {
	
	static {
       System.out.println("\nCalculate spending per counterparty");
       System.out.println("\nTask 4.3: Find the total transactions for a given counterparty");
    }
	
	
    @Test
    void forTransactionsFromNoMatchingCounterparty() {
    System.out.println("\nTotal should be zero when there are no matching transactions.");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Oyster Card", "TFL", 25.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Dry Cleaning", "Laundry Inc", 5.0, 0, 10.0)
                );

    assertThat(SpendingPerCounterparty.from(transactionFeed).getTotalSpendingFor("No Such Counterparty")).isEqualTo(0);
    System.out.println("\nTC-01 - forTransactionsFromNoMatchingCounterparty() - Executed successfully.");
    }

    
    @Test
    void forTransactionsFromoMatchingCounterparties() {
    System.out.println("\nTotal should include all the transactions for a given counterparty");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Oyster Card", "TFL", 25.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Dry Cleaning", "Laundry Inc", 5.0, 0, 10.0)
                );

    assertThat(SpendingPerCounterparty.from(transactionFeed).getTotalSpendingFor("Coffee and Co")).isEqualTo(20.0);
    System.out.println("\nTC-02 - forTransactionsFromoMatchingCounterparties() - Executed successfully.");
    }

    
    @Test
    void forTransactionsFromoMatchingCounterpartiesWithWithdrawalsAndDeposits() {
    System.out.println("\nTotal should include both withdrawals and deposits");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Oyster Card", "TFL", 25.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 0, 5.0, 10.0),
                        trx("Dry Cleaning", "Laundry Inc", 5.0, 0, 10.0)
                );

    assertThat(SpendingPerCounterparty.from(transactionFeed).getTotalSpendingFor("Coffee and Co")).isEqualTo(15.0);
    System.out.println("\nTC-03 - forTransactionsFromoMatchingCounterpartiesWithWithdrawalsAndDeposits() - Executed successfully.");
    }
	
}