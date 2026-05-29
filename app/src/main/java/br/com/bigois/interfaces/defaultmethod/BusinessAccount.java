package br.com.bigois.interfaces.defaultmethod;

import java.math.BigDecimal;

import br.com.bigois.interfaces.classicinterface.AccountType;
import br.com.bigois.interfaces.classicinterface.BankAccount;

public class BusinessAccount extends BankAccount implements BrokerAccount {
    public BusinessAccount(Long id) {
        super(id, AccountType.BUSINESS);
    }

    @Override
    public BigDecimal simulateInvestment(BigDecimal amount) {
        // Business accounts get an additional 1% return on top of the standard 5% from BrokerAccount
        return BrokerAccount.super.simulateInvestment(amount).multiply(new BigDecimal("1.01"));
    }
}
