package interfaces.classicinterface;

import java.math.BigDecimal;

public class ClassicInterfaceApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1L);
        BankAccount account2 = new BankAccount(2L);

        account1.deposit(BigDecimal.valueOf(100));
        account2.deposit(BigDecimal.valueOf(200));

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());

        account1.withdraw(BigDecimal.valueOf(10));
        account2.withdraw(BigDecimal.valueOf(90));

        System.out.println("Account 1 balance after witdraw: " + account1.getBalance());
        System.out.println("Account 2 balance after witdraw: " + account2.getBalance());
    }
}
