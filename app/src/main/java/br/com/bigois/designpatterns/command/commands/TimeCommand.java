package br.com.bigois.designpatterns.command.commands;

import br.com.bigois.designpatterns.command.receiver.DateTimeReceiver;

public class TimeCommand implements Command {
	private final DateTimeReceiver receiver;

	public TimeCommand(DateTimeReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.showTime();
	}
}
