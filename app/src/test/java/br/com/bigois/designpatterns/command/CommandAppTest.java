package br.com.bigois.designpatterns.command;

import br.com.bigois.MainAppRunner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CommandAppTest {
	@Test
	void shouldExecuteCommandsAndExit() throws Exception {
		assertEquals(0, MainAppRunner.runInNewProcess(CommandApp.class, "1\n2\n3\nexit\n"));
	}
}
