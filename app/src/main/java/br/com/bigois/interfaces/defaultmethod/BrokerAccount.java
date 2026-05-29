package br.com.bigois.interfaces.defaultmethod;

import java.math.BigDecimal;

public interface BrokerAccount {
    /* public */ default BigDecimal simulateInvestment(BigDecimal amount) {
        if (amount.signum() <= 0) {
            throw new IllegalArgumentException("Investment amount must be positive");
        }

        // Simulate an investment return of 5%
        return amount.multiply(new BigDecimal("1.05"));
    }
}
