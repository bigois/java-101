package br.com.bigois.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ExceptionAppTest {
    @Test
    void shouldThrowIntentionalUncheckedException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> ExceptionApp.main(new String[0]));

        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }
}
