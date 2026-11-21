package br.com.bigois.consumer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerApp {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		// Lambda expression with explicit parameter type
		names.forEach((String s) -> System.out.println(s.charAt(0)));

		// Lambda expression with implicit parameter type
		names.forEach(s -> System.out.println(s.charAt(s.length() - 1)));

		// Method reference to shorter syntax
		names.forEach(System.out::println);

		// Custom Consumer implementation to print each name in line
		Consumer<String> printNamesInLine = new PrintInLine();
		names.forEach(printNamesInLine);

		// Custom static method reference to print each name as an unordered list
		names.forEach(PrintInLine::printAsUnorderedList);

		// Anonymous class to print each name duplicated
		@SuppressWarnings("Convert2Lambda")
		Consumer<String> duplicateNames = new Consumer<>() {
			@Override
			public void accept(String s) {
				System.out.println(s + s);
			}
		};
		names.forEach(duplicateNames);

		// Another anonymous class passed directly to the forEach method to print each name in uppercase
		// noinspection Convert2Lambda
		names.forEach(new Consumer<>() {
			@Override
			public void accept(String s) {
				System.out.println(s.toUpperCase());
			}
		});

		// Mutable list is required, because the sort method modifies the list in place
		Comparator<String> orderNamesByLength = new OrderByLength();
		names.sort(orderNamesByLength);
		System.out.println("Names sorted by length: " + names);
	}
}
