package br.com.bigois.textblocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class TextBlocksAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> TextBlocksApp.main(new String[0]));
	}
}
