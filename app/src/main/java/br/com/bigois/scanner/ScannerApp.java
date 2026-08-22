
package br.com.bigois.scanner;

import java.util.Scanner;

public class ScannerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (sc) {
			System.out.println("What is your name?");
			String name = sc.nextLine();
			System.out.println("How old are you?");
			int age = sc.nextInt();

			System.out.println("My name is " + name + " and I am " + age + " years old");
		}
	}
}
