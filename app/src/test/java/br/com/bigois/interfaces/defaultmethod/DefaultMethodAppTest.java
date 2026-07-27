package br.com.bigois.interfaces.defaultmethod;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class DefaultMethodAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> DefaultMethodApp.main(new String[0]));
    }
}
