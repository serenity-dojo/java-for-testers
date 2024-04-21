package com.serenitydojo.streams.exercises.moneymanager.solutions;
import static com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity.trx;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.testng.annotations.Test;
import com.serenitydojo.streams.exercises.moneymanager.domain.SpendingPerCounterparty;
import com.serenitydojo.streams.exercises.moneymanager.domain.TransactionFeedEntryEntity;

public class Module4FindTotalTransactionsForACounterpartyTests {
	
	static {
       System.out.println("\nCalculate spending per counterparty");
       System.out.println("\nTask 4.2: Find the transactions for a given counterparty.");
    }
	
	
    @Test
    void forTransactionsFromNoMatchingCounterparty() {
    System.out.println("\nWhen there are no matching transactions");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Oyster Card", "TFL", 25.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Dry Cleaning", "Laundry Inc", 5.0, 0, 10.0)
                );

    assertThat(SpendingPerCounterparty.from(transactionFeed).getPurchasesFrom("No Such Counterparty")).isEmpty();
    System.out.println("\nTC-01 - forTransactionsFromNoMatchingCounterparty() - Executed successfully.");
    }


    @Test
    void whenThereAreBothDepositsAndWithdrawals() {
    System.out.println("\nWhen there are deposits and withdrawals");
    Stream<TransactionFeedEntryEntity> transactionFeed = Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Salary", "Employers Inc", 0, 1000, 1990),
                        trx("Oyster Card", "TFL", 25.0, 0, 10.0),
                        trx("Dry Cleaning", "Laundry Inc", 5.0, 0, 10.0)
                );

    assertThat(SpendingPerCounterparty.from(transactionFeed).getCounterparties()).containsExactly("Coffee and Co", "Laundry Inc", "TFL");
    System.out.println("\nTC-02 - whenThereAreBothDepositsAndWithdrawals() - Executed successfully.");
    }

    
    @Test
    void forTransactionsFromSeveralCounterparty() {
    System.out.println("\nWhen there are several matching transactions");
    Stream<TransactionFeedEntryEntity> transactionFeed =
                Stream.of(
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Oyster Card", "TFL", 25.0, 0, 10.0),
                        trx("Coffee", "Coffee and Co", 10.0, 0, 10.0),
                        trx("Dry Cleaning", "Laundry Inc", 5.0, 0, 10.0)
                );

    assertThat(SpendingPerCounterparty.from(transactionFeed).getPurchasesFrom("Coffee and Co")).hasSize(2)
                        .allMatch(entry -> entry.getCounterparty().equals("Coffee and Co"));
    System.out.println("\nTC-03 - forTransactionsFromSeveralCounterparty() - Executed successfully.");
    }
    
}