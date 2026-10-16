package br.com.bigois.designpatterns.command.commands;

import br.com.bigois.designpatterns.command.receiver.DateTimeReceiver;

public class DayOfWeekCommand implements Command {
	private final DateTimeReceiver receiver;

	public DayOfWeekCommand(DateTimeReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.showDayOfWeek();
	}
}
