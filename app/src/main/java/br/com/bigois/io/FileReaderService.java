package br.com.bigois.io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public final class FileReaderService {
	private FileReaderService() {
	}

	public static String readWithInputStream(String file) throws IOException {
		// getResourceAsStream expects a file inside the resources folder
		try (InputStream inputStream = FileReaderService.class
				.getClassLoader()
				.getResourceAsStream(file)) {
			if (inputStream == null) {
				throw new IOException("File not found in resources folder: " + file);
			}

			byte[] bytes = inputStream.readAllBytes();
			return new String(bytes, StandardCharsets.UTF_8);
		}
	}
}
