package br.com.bigois.designpatterns.command.client;

import br.com.bigois.designpatterns.command.commands.DateCommand;
import br.com.bigois.designpatterns.command.commands.DayOfWeekCommand;
import br.com.bigois.designpatterns.command.commands.TimeCommand;
import br.com.bigois.designpatterns.command.invoker.CommandInvoker;
import br.com.bigois.designpatterns.command.receiver.DateTimeReceiver;

import java.util.Scanner;

public class MenuClient implements AutoCloseable {
	private final Scanner scanner;
	private final DateTimeReceiver receiver;
	private final CommandInvoker invoker;

	public MenuClient() {
		scanner = new Scanner(System.in);
		receiver = new DateTimeReceiver();
		invoker = new CommandInvoker();
	}

	public void showMenuOptions() {
		System.out.println("""
				MENU OPTIONS
				1. What time is it?
				2. What is the date today?
				3. What is the day of the week?
				Choose an option (type 'exit' to quit):\s""");
	}

	public String getUserInput() {
		return scanner.nextLine();
	}

	public void run() {
		String userInput = "";

		while (!userInput.equals("exit")) {
			showMenuOptions();
			userInput = getUserInput().strip().toLowerCase();

			switch (userInput) {
				case "1" -> invoker.executeCommand(new TimeCommand(receiver));
				case "2" -> invoker.executeCommand(new DateCommand(receiver));
				case "3" -> invoker.executeCommand(new DayOfWeekCommand(receiver));
				case "exit" -> System.out.println("Exiting the application. Goodbye!");
				default -> System.out.println("Invalid option. Please try again.");
			}
		}
	}

	@Override
	public void close() {
		scanner.close();
	}
}
