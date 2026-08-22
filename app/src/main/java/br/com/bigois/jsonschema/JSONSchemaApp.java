
package br.com.bigois.jsonschema;

import com.networknt.schema.Error;

import java.util.List;
import java.util.Locale;

public class JSONSchemaApp {
	public static void main(String[] args) {
		// Set the default locale to English to ensure consistent error messages
		Locale.setDefault(Locale.ENGLISH);

		// Define the schema and JSON file names
		String schemaFileName = "user-schema.json";
		String jsonFileName = "user.json";

		// Create an instance of JSONValidationService and validate the JSON file against the schema
		JSONValidationService validationService = new JSONValidationService(schemaFileName);
		List<Error> validationMessages = validationService.validate(jsonFileName);

		// Check if there are any validation errors
		if (validationMessages.isEmpty()) {
			System.out.println("JSON is valid.");
			return;
		}

		// Print validation errors
		System.out.println("JSON is invalid:");
		validationMessages.forEach(message -> System.out.println("- " + message.getMessage()));
	}
}
