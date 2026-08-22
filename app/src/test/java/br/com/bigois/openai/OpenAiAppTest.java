package br.com.bigois.openai;

import br.com.bigois.MainAppRunner;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class OpenAiAppTest {
	@Test
	void shouldFailFastWithoutCallingApisWhenApiKeyIsMissing() throws Exception {
		int exitCode = MainAppRunner.runInNewProcess(OpenAiApp.class, "", null, Set.of("OPENAI_API_KEY"));

		assertNotEquals(0, exitCode);
	}
}
