package br.com.bigois.designpatterns.command.receiver;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeReceiver {
	public void showTime() {
		System.out.println("The current time is: " + LocalTime.now()
				.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
	}

	public void showDate() {
		System.out.println("The current date is: " + LocalDate.now());
	}

	public void showDayOfWeek() {
		System.out.println("The current day of the week is: " + LocalDate.now().getDayOfWeek());
	}
}
