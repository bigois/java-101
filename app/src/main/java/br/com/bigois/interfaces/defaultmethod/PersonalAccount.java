package br.com.bigois.interfaces.defaultmethod;

import br.com.bigois.interfaces.classicinterface.AccountType;
import br.com.bigois.interfaces.classicinterface.BankAccount;

public class PersonalAccount extends BankAccount implements BrokerAccount {
    public PersonalAccount(Long id) {
        super(id, AccountType.PERSONAL);
    }
}
