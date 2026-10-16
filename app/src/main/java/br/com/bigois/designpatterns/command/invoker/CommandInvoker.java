package br.com.bigois.designpatterns.command.invoker;

import br.com.bigois.designpatterns.command.commands.Command;

public class CommandInvoker {
	public void executeCommand(Command command) {
		command.execute();
	}
}
