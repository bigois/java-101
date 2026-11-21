package br.com.bigois.optional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptionalAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> OptionalApp.main(new String[0]));
	}

	@Test
	void shouldReturnEmptyOptionalForNullMiddleName() {
		Person person = new Person("John", null, "Doe");
		assertTrue(person.getMiddleName().isEmpty());
	}

	@Test
	void shouldReturnNonEmptyOptionalForNonNullMiddleName() {
		Person person = new Person("John", "Michael", "Doe");
		assertTrue(person.getMiddleName().isPresent());
	}

	@Test
	void shouldReturnFirstName() {
		Person person = new Person("John", "Michael", "Doe");
		assertEquals("John", person.getFirstName());
	}

	@Test
	void shouldReturnLastName() {
		Person person = new Person("John", "Michael", "Doe");
		assertEquals("Doe", person.getLastName());
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
