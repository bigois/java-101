package br.com.bigois.jsonschema;

import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class JSONValidationService {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final JsonSchema schema;

    public JSONValidationService(String schemaFileName) {
        JsonNode schemaNode = readJsonFromResources(schemaFileName);
        JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V202012);

        this.schema = factory.getSchema(schemaNode);
    }

    public Set<ValidationMessage> validate(String jsonFileName) {
        JsonNode jsonNode = readJsonFromResources(jsonFileName);

        return schema.validate(jsonNode);
    }

    private JsonNode readJsonFromResources(String fileName) {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new IllegalArgumentException("File not found in resources: " + fileName);
            }

            return objectMapper.readTree(inputStream);
        } catch (IOException exception) {
            throw new IllegalArgumentException("Error reading JSON file: " + fileName, exception);
        }
    }
}
