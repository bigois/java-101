package br.com.bigois.io.read.inputstream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class InputStreamAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> InputStreamApp.main(new String[0]));
    }
}
