
package br.com.bigois.methodReference;

import br.com.bigois.optional.Person;

import java.util.List;

public class MethodReferenceApp {
	public static void main(String[] args) {
		List<String> familyMembers = List.of("Guilherme", "Danna", "Bernardo", "Henrique");
		familyMembers.forEach(System.out::println);

		String lastName = "Bigois";
		List<Person> people = List.of(
				new Person("Guilherme", lastName),
				new Person("Danna", lastName),
				new Person("Bernardo", lastName),
				new Person("Henrique", lastName)
		);
		people.forEach(System.out::println);

		Calculator sumCalculator = Integer::sum;
		int sum = sumCalculator.calculateToValues(1, 2);
		System.out.println(sum);

		Calculator timesCalculator = (a, b) -> a * b;
		int times = timesCalculator.calculateToValues(2, 3);
		System.out.println(times);

		Calculator complexCalculator = (a, b) -> {
			int result = a * b;

			if (result > 10) {
				result = Math.round(result * 0.15f);
			}

			return result;
		};
		int complex = complexCalculator.calculateToValues(2, 3);
		System.out.println(complex);
	}
}
