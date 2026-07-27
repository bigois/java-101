package br.com.bigois.comparable;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class ComparableAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> ComparableApp.main(new String[0]));
    }
}
