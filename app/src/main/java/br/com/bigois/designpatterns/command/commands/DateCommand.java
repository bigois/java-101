package br.com.bigois.designpatterns.command.commands;

import br.com.bigois.designpatterns.command.receiver.DateTimeReceiver;

public class DateCommand implements Command {
	private final DateTimeReceiver receiver;

	public DateCommand(DateTimeReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.showDate();
	}
}
