package br.com.bigois.interfaces.classicinterface;

import java.math.BigDecimal;

public class ClassicInterfaceApp {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(1L, AccountType.PERSONAL);
		BankAccount account2 = new BankAccount(2L, AccountType.PERSONAL);

		account1.deposit(new BigDecimal("100"));
		account2.deposit(new BigDecimal("200"));

		System.out.println("Account 1 balance: " + account1.getBalance());
		System.out.println("Account 2 balance: " + account2.getBalance());

		account1.withdraw(new BigDecimal("10"));
		account2.withdraw(new BigDecimal("90"));

		System.out.println("Account 1 balance after withdraw: " + account1.getBalance());
		System.out.println("Account 2 balance after withdraw: " + account2.getBalance());
	}
}
