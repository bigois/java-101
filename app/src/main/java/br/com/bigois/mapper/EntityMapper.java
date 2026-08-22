
package br.com.bigois.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EntityMapper {
	private final ObjectMapper mapper = new ObjectMapper();

	public <T> T mapEntity(String responseBody, Class<T> entityClass) {
		try {
			return mapper.readValue(responseBody, entityClass);
		} catch (JsonProcessingException e) {
			throw new RuntimeException("Error while mapping response body to an entity class: " + e.getMessage(), e);
		}
	}
}
