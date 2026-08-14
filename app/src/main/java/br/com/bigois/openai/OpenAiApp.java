package br.com.bigois.openai;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class OpenAiApp {
	public static void main(String[] args) {
		// Set the default charset to UTF-8 for the console output
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

		// Translate a text to Brazilian Portuguese using the OpenApiService
		OpenApiService openApiService = new OpenApiService();
		String openAPIresponse = openApiService.translateToBrazilianPortuguese("It's simple, but it helped me structure the topic clearly.");
		System.out.println("OpenAI response: " + openAPIresponse);

		// Translate a text to Brazilian Portuguese using the MyMemoryService
		MyMemoryService myMemoryService = new MyMemoryService();
		String myMemoryResponse = myMemoryService.translateToBrazilianPortuguese("It's simple, but it helped me structure the topic clearly.");
		System.out.println("MyMemory response: " + myMemoryResponse);
	}
}
