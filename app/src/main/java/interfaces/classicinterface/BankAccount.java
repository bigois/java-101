package interfaces.classicinterface;

import java.math.BigDecimal;

public class BankAccount implements AccountOperation {
    private final Long id;
    private final AccountType accountType;
    private BigDecimal balance;

    public BankAccount(Long id, AccountType accountType) {
        this.id = id;
        this.accountType = accountType;
        this.balance = BigDecimal.ZERO;
    }

    @Override
    public void deposit(BigDecimal amount) throws IllegalArgumentException {
        if (amount.signum() <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        this.balance = this.balance.add(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) throws IllegalArgumentException {
        if (amount.signum() <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }

        if (this.balance.compareTo(amount) < 0) {
            throw new IllegalArgumentException("Insufficient funds");
        }

        this.balance = this.balance.subtract(amount);
    }

    @Override
    public BigDecimal getBalance() {
        return this.balance;
    }

    public Long getId() {
        return this.id;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }
}
