package br.com.bigois.optional;

import lombok.*;

import java.util.Optional;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Person {
	@Getter
	@NonNull
	private String firstName;
	private String middleName;
	@Getter
	@NonNull
	private String lastName;

	/* Constructor overloading */
	public Person(String firstName, String lastName) {
		/* Constructor chaining */
		this(firstName, null, lastName);
	}

	public Optional<String> getMiddleName() {
		return Optional.ofNullable(middleName);
	}
}
