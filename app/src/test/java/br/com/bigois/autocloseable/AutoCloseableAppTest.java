
package br.com.bigois.autocloseable;

import br.com.bigois.MainAppRunner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AutoCloseableAppTest {
	@TempDir
	Path tempDir;

	@Test
	void shouldRunMain() throws Exception {
		Files.createDirectories(tempDir.resolve("docs"));

		int exitCode = MainAppRunner.runInNewProcess(AutoCloseableApp.class, "", tempDir);

		assertEquals(0, exitCode);
		assertTrue(Files.exists(tempDir.resolve("docs").resolve("people-report.xlsx")));
	}
}
