package br.com.bigois.polymorphism;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class PolymorphismAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> PolymorphismApp.main(new String[0]));
    }
}
