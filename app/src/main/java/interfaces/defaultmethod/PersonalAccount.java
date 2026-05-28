package interfaces.defaultmethod;

import interfaces.classicinterface.BankAccount;

public class PersonalAccount extends BankAccount implements BrokerAccount {
    public PersonalAccount(Long id) {
        super(id);
    }
}
