package br.com.bigois.interfaces.classicinterface;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class ClassicInterfaceAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> ClassicInterfaceApp.main(new String[0]));
    }
}
