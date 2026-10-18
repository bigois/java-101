package br.com.bigois.consumer;

import java.util.function.Consumer;

public class PrintInLine implements Consumer<String> {
	@Override
	public void accept(String s) {
		System.out.println("Printing: " + s);
	}

	public static void printAsUnorderedList(String s) {
		System.out.println("- " + s);
	}
}
