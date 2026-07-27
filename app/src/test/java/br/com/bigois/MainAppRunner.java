package br.com.bigois;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class MainAppRunner {
    private MainAppRunner() {
    }

    public static int runInNewProcess(Class<?> mainClass, String input) throws IOException, InterruptedException {
        return runInNewProcess(mainClass, input, null);
    }

    public static int runInNewProcess(Class<?> mainClass, String input, Path workingDirectory)
            throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder(
                javaExecutable(),
                "-cp",
                System.getProperty("java.class.path"),
                mainClass.getName());
        processBuilder.redirectOutput(ProcessBuilder.Redirect.DISCARD);
        processBuilder.redirectError(ProcessBuilder.Redirect.DISCARD);

        if (workingDirectory != null) {
            processBuilder.directory(workingDirectory.toFile());
        }

        Process process = processBuilder.start();

        try (var stdin = process.getOutputStream()) {
            stdin.write(input.getBytes(StandardCharsets.UTF_8));
        }

        return process.waitFor();
    }

    private static String javaExecutable() {
        String executableName = System.getProperty("os.name").toLowerCase().contains("win")
                ? "java.exe"
                : "java";

        return Path.of(System.getProperty("java.home"), "bin", executableName).toString();
    }
}
