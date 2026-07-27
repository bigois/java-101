package br.com.bigois.io.write.filewriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import br.com.bigois.MainAppRunner;

class FileWriterAppTest {
    @TempDir
    Path tempDir;

    @Test
    void shouldRunMainWhenFileAlreadyExists() throws Exception {
        Path docs = tempDir.resolve("docs");
        Files.createDirectories(docs);
        Files.writeString(docs.resolve("matrix.json"), "{}", StandardCharsets.UTF_8);

        int exitCode = MainAppRunner.runInNewProcess(FileWriterApp.class, "", tempDir);

        assertEquals(0, exitCode);
    }
}
