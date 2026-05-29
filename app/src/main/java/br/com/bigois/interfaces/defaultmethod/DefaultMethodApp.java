package br.com.bigois.interfaces.defaultmethod;

import java.math.BigDecimal;

public class DefaultMethodApp {
    public static void main(String[] args) {
        PersonalAccount personalAccount = new PersonalAccount(1L);
        BusinessAccount businessAccount = new BusinessAccount(2L);

        System.out.println("Simulated investment for personal account: "
                + personalAccount.simulateInvestment(new BigDecimal("100")));
        System.out.println("Simulated investment for business account: "
                + businessAccount.simulateInvestment(new BigDecimal("100")));
    }
}
