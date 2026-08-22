package br.com.bigois.interfaces.classicinterface;

import java.math.BigDecimal;

public interface AccountOperation {
	/* public abstract */ void deposit(BigDecimal amount) throws IllegalArgumentException;

	/* public abstract */ void withdraw(BigDecimal amount);

	/* public abstract */ BigDecimal getBalance();
}
