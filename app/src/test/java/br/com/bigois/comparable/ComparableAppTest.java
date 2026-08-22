
package br.com.bigois.comparable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ComparableAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> ComparableApp.main(new String[0]));
	}
}
