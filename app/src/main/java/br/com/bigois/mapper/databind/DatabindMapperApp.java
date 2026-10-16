package br.com.bigois.mapper.databind;

import br.com.bigois.optional.Person;
import tools.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

public class DatabindMapperApp {
	public static void main(String[] args) {
		String body = """
					[
						{"firstName":"Guilherme","middleName":"","lastName":"Bigois"},
						{"firstName":"Henrique","middleName":"do Espírito Santo","lastName":"Bigois"}
					]
		""";

		// Deserializing JSON array into a list of Person objects with Jackson's ObjectMapper
		ObjectMapper mapper = new ObjectMapper();
		Person[] personArray = mapper.readValue(body, Person[].class);

		List<Person> personList = Arrays.asList(personArray);
		System.out.println(personList);
	}
}
