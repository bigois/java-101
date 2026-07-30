package br.com.bigois.jsonschema;

import com.networknt.schema.*;
import com.networknt.schema.Error;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class JSONValidationService {
	private final Schema schema;

	public JSONValidationService(String schemaFileName) {
		try (InputStream schemaInputStream = openResource(schemaFileName)) {
			SchemaRegistry registry = SchemaRegistry.withDefaultDialect(SpecificationVersion.DRAFT_2020_12);
			this.schema = registry.getSchema(schemaInputStream, InputFormat.JSON);
		} catch (IOException exception) {
			throw new IllegalArgumentException("Error reading JSON schema file: " + schemaFileName, exception);
		}
	}

	public List<Error> validate(String jsonFileName) {
		String jsonContent = readTextFromResources(jsonFileName);
		return schema.validate(jsonContent, InputFormat.JSON);
	}

	private String readTextFromResources(String fileName) {
		try (InputStream inputStream = openResource(fileName)) {
			return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
		} catch (IOException exception) {
			throw new IllegalArgumentException("Error reading JSON file: " + fileName, exception);
		}
	}

	private InputStream openResource(String fileName) {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
		if (inputStream == null) {
			throw new IllegalArgumentException("File not found in resources: " + fileName);
		}
		return inputStream;
	}
}
