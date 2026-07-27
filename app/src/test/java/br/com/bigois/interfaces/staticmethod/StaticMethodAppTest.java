package br.com.bigois.interfaces.staticmethod;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class StaticMethodAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> StaticMethodApp.main(new String[0]));
    }
}
