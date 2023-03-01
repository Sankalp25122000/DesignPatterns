package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		notifiers = new ArrayList<INotifier>();
		
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}

	public void deposit(double amount) {
		balance += amount;
		for (INotifier x : notifiers) {
			x.notiFyUser(this, amount, "Deposit ");
		}

	}

	public void withdraw(double amount) throws InsuffiecientException {
		if (balance >amount) {
			balance -= amount;
			for (INotifier x : notifiers) {
				x.notiFyUser(this, amount, "Withdrawal ");
			}
		} else {
			throw new InsuffiecientException("Insufficient Funds..");
		}

	}

	public void registeredNotifier(INotifier notifier) {
		if(notifiers.isEmpty())
		notifiers.add(notifier);
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers+ "]";
	}

}
