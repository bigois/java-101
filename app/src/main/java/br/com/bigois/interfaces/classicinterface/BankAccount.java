package br.com.bigois.interfaces.classicinterface;

import java.math.BigDecimal;

public class BankAccount implements AccountOperation {
    private final Long id;
    private final AccountType accountType;
    private BigDecimal balance;

    public BankAccount(Long id, AccountType accountType) {
        this.id = id;
        this.accountType = accountType;
        balance = BigDecimal.ZERO; // There is no ambiguity, so [this.] IS NOT required here
    }

    @Override
    public void deposit(BigDecimal amount) throws IllegalArgumentException {
        if (amount.signum() <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        balance = balance.add(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) throws IllegalArgumentException {
        if (amount.signum() <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }

        if (balance.compareTo(amount) < 0) {
            throw new IllegalArgumentException("Insufficient funds");
        }

        balance = balance.subtract(amount);
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    public Long getId() {
        return id;
    }

    public AccountType getAccountType() {
        return accountType;
    }
}
