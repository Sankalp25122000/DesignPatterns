package com.aurionpro.model;

public class EmailNotifier implements INotifier {

	@Override
	public void notiFyUser(Account account, double amount, String transactionType) {
		System.out.println("Sending notification by email..");

		System.out.println("------------------------------");
		System.out.println("Account Number " + account.getAccountNumber());
		System.out.println("Amount " + amount);
		System.out.println("Transaction type " + transactionType);
		System.out.println("Current balance "+account.getBalance());
		System.out.println();

	}

	@Override
	public String toString() {
		return "EmailNotifier";
	}
	



}
