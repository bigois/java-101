package br.com.bigois.designpatterns.command;

import br.com.bigois.designpatterns.command.client.MenuClient;

public class CommandApp {
	public static void main(String[] args) {
		try (MenuClient menu = new MenuClient()) {
			menu.run();
		}
	}
}
