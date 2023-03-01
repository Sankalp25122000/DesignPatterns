package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotifier;
import com.aurionpro.model.InsuffiecientException;
import com.aurionpro.model.SmsNotifier;

public class AccountTest {

	public static void main(String[] args) throws InsuffiecientException {
		Account acc = new Account(1234,"Sankalp",4000);
		
		acc.withdraw(1000);
		acc.registeredNotifier(new SmsNotifier());
		acc.registeredNotifier(new EmailNotifier());
		System.out.println(acc);
		Account acc1 = new Account(2345,"Sameer",8000);
		
		acc1.registeredNotifier(new EmailNotifier());
		acc1.registeredNotifier(new EmailNotifier());
		acc1.registeredNotifier(new SmsNotifier());
		acc1.deposit(2000);
		System.out.println(acc1);

	}

}
