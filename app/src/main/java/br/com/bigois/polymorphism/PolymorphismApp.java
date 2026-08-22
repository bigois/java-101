
package br.com.bigois.polymorphism;

import br.com.bigois.interfaces.classicinterface.BankAccount;
import br.com.bigois.interfaces.defaultmethod.BrokerAccount;
import br.com.bigois.interfaces.defaultmethod.BusinessAccount;
import br.com.bigois.interfaces.defaultmethod.PersonalAccount;

import java.math.BigDecimal;

public class PolymorphismApp {
	public static void main(String[] args) {
		PersonalAccount personalAccount = new PersonalAccount(1L);
		BusinessAccount businessAccount = new BusinessAccount(2L);

		testOperations(personalAccount);
		testInvestment(personalAccount, new BigDecimal("1000"));

		System.out.println();

		testOperations(businessAccount);
		testInvestment(businessAccount, new BigDecimal("1000"));
	}

	// Polymorphism by accepting any SUBCLASS of BankAccount
	public static void testOperations(BankAccount account) {
		System.out.println("=".repeat(40));
		System.out.println("Account ID: " + account.getId() + " | " + "Account Type: " + account.getAccountType());
		System.out.println("=".repeat(40));

		System.out.println("Balance before deposit: " + account.getBalance());
		account.deposit(new BigDecimal("500"));
		System.out.println("Balance after deposit: " + account.getBalance());
		account.withdraw(new BigDecimal("200"));
		System.out.println("Balance after withdrawal: " + account.getBalance());
	}

	// Polymorphism by accepting any class IMPLEMENTING BrokerAccount
	public static void testInvestment(BrokerAccount account, BigDecimal amount) {
		BigDecimal investedAmount = account.simulateInvestment(amount);
		System.out.println("Investment return: " + investedAmount);
	}
}
