package br.com.bigois.methodReference;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class MethodReferenceAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> MethodReferenceApp.main(new String[0]));
    }
}
