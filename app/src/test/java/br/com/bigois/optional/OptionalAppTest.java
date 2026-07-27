package br.com.bigois.optional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class OptionalAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> OptionalApp.main(new String[0]));
    }
}
