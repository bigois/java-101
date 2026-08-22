
package br.com.bigois.interfaces.classicinterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ClassicInterfaceAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> ClassicInterfaceApp.main(new String[0]));
	}
}
