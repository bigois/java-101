package br.com.bigois.interfaces.functional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class FunctionalAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> FunctionalApp.main(new String[0]));
    }
}
