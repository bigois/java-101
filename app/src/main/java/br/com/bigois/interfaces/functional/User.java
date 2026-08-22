
package br.com.bigois.interfaces.functional;

// The java.time package is the modern Java API for date and time, introduced in Java 8
// It provides classes for working with dates, times, durations, and time zones
// Its main classes follow the ISO-8601 calendar system and are immutable and thread-safe

import java.time.LocalDate;

public class User {
	private final String email;
	private final LocalDate birthDate;

	public User(String email, LocalDate birthDate) {
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "User [email=" + getEmail() + ", birthDate=" + getBirthDate() + "]";
	}
}
