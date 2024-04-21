package com.serenitydojo.streams.exercises.moneymanager.domain;
import java.time.LocalDate;

public class TransactionFeedEntryEntity {

	private final LocalDate localDate;
	private final String description;
	private final String counterparty;
	private final double withdrawal;
	private final double deposit;
	private final double balance;

	public TransactionFeedEntryEntity(LocalDate localDate, String description, String counterparty, double withdrawal,
			double deposit, double balance) {
		this.localDate = localDate;
		this.description = description;
		this.counterparty = counterparty;
		this.withdrawal = withdrawal;
		this.deposit = deposit;
		this.balance = balance;
	}

	/**
	 * @return the localDate
	 */
	public LocalDate getLocalDate() {
		return localDate;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the counterparty
	 */
	public String getCounterparty() {
		return counterparty;
	}

	/**
	 * @return the withdrawal
	 */
	public double getWithdrawal() {
		return withdrawal;
	}

	/**
	 * @return the deposit
	 */
	public double getDeposit() {
		return deposit;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	public boolean isDeposit() {
		return withdrawal == 0;
	}

	public boolean isWithdrawl() {
		return deposit == 0;
	}

	public static TransactionFeedEntryEntity trx(String description, String counterparty, double withdrawal,
			double deposit, double balance) {
		return new TransactionFeedEntryEntity(LocalDate.now(), description, counterparty, withdrawal, deposit, balance);
	}

	public static TransactionFeedEntryEntity trx(LocalDate date, String description, String counterparty,
			double withdrawal, double deposit, double amount, double balance) {
		return new TransactionFeedEntryEntity(date, description, counterparty, withdrawal, deposit, balance);
	}

}