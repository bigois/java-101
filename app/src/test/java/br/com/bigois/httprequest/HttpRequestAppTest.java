package br.com.bigois.httprequest;

import br.com.bigois.MainAppRunner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HttpRequestAppTest {
	@Test
	void shouldRunMainAndExitWithoutCallingApi() throws Exception {
		int exitCode = MainAppRunner.runInNewProcess(HttpRequestApp.class, "exit%n".formatted());

		assertEquals(0, exitCode);
	}
}
