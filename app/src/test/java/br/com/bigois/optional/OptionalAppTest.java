package br.com.bigois.optional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OptionalAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> OptionalApp.main(new String[0]));
	}

	@Test
	void shouldReturnEmptyOptionalForNullMiddleName() {
		Person person = new Person("John", null, "Doe");
		assert(person.getMiddleName().isEmpty());
	}

	@Test
	void shouldReturnNonEmptyOptionalForNonNullMiddleName() {
		Person person = new Person("John", "Michael", "Doe");
		assert(person.getMiddleName().isPresent());
	}

	@Test
	void shouldReturnFirstName() {
		Person person = new Person("John", "Michael", "Doe");
		assert(person.getFirstName().equals("John"));
	}

	@Test
	void shouldReturnLastName() {
		Person person = new Person("John", "Michael", "Doe");
		assert(person.getLastName().equals("Doe"));
	}


	@Test
	@SuppressWarnings("DataFlowIssue")
	void shouldThrowExceptionForNullFirstName() {
		assertThrows(NullPointerException.class, () -> new Person(null, "Michael", "Doe"));
	}

	@Test
	@SuppressWarnings("DataFlowIssue")
	void shouldThrowExceptionForNullLastName() {
		assertThrows(NullPointerException.class, () -> new Person("John", "Michael", null));
	}
}
