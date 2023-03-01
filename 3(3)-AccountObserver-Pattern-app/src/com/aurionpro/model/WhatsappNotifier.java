package com.aurionpro.model;

public class WhatsappNotifier implements INotifier {

	@Override
	public void notiFyUser(Account account,double amount,String transactionType) {
		System.out.println("Sending notification by whataspp..");
		System.out.println(account);
		System.out.println("------------------------------");

	}

	@Override
	public String toString() {
		return "WhatsappNotifier";
	}
	

}
