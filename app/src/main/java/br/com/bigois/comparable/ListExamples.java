package br.com.bigois.comparable;

import br.com.bigois.interfaces.classicinterface.AccountType;
import br.com.bigois.interfaces.classicinterface.BankAccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExamples {
	private final List<String> stringList = new ArrayList<>();
	private final List<BankAccount> bankAccountList = new ArrayList<>();

	public ListExamples() {
		stringList.addAll(List.of("C", "A", "B"));
		bankAccountList.addAll(List.of(
				new BankAccount(1L, AccountType.PERSONAL, new BigDecimal("1000.00")),
				new BankAccount(2L, AccountType.BUSINESS, new BigDecimal("500.00"))));
	}

	public void sortStringList() {
		System.out.println("String list before sort: " + stringList);

		stringList.sort(Comparator.naturalOrder());
		System.out.println("String list after natural sort: " + stringList);

		stringList.sort(Comparator.reverseOrder());
		System.out.println("String list after reverse sort: " + stringList);
	}

	public void sortBankAccountListByAccountType() {
		System.out.println("Bank account list before sort: " + bankAccountList);

		bankAccountList.sort(Comparator.comparing((BankAccount account) -> {
			if (account.getAccountType().equals(AccountType.BUSINESS)) {
				return 1;
			} else {
				return 0;
			}
		}));

		System.out.println("Bank account list after sort by account type: " + bankAccountList);
	}

	public void sortBankAccountListByBalance() {
		System.out.println("Bank account list before sort: " + bankAccountList);

		bankAccountList.sort(Comparator.comparing((BankAccount account) -> account.getBalance()));
		System.out.println("Bank account list after sort by balance using lambda: " + bankAccountList);
	}

	public void sortBankAccountListById() {
		System.out.println("Bank account list before sort: " + bankAccountList);

		bankAccountList.sort(Comparator.naturalOrder());
		System.out.println("Bank account list after sort by id using natural order: " + bankAccountList);
	}
}
