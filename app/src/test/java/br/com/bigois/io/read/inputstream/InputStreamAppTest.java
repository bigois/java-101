
package br.com.bigois.io.read.inputstream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class InputStreamAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> InputStreamApp.main(new String[0]));
	}
}
