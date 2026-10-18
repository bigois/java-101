package br.com.bigois.switchexpressions;

@SuppressWarnings({"EnhancedSwitchMigration", "DataFlowIssue"})
public class SwitchExpressionsApp {
	public static void main(String[] args) {
		// Traditional switch statements have been available since Java 1.0
		// break stops execution from continuing into the next case
		int dayOfWeek = 1;
		String dayName;
		switch (dayOfWeek) {
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thursday";
				break;
			case 5:
				dayName = "Friday";
				break;
			case 6:
				dayName = "Saturday";
				break;
			case 7:
				dayName = "Sunday";
				break;
			default:
				dayName = "Invalid day";
		}
		System.out.println("Day: " + dayName);

		// Switch expressions debuted as a preview in Java 12 and became standard in Java 14
		// Each arrow supplies a value directly, without break
		int month = 1;
		String monthName = switch (month) {
			case 1 -> "January";
			case 2 -> "February";
			case 3 -> "March";
			case 4 -> "April";
			case 5 -> "May";
			case 6 -> "June";
			case 7 -> "July";
			case 8 -> "August";
			case 9 -> "September";
			case 10 -> "October";
			case 11 -> "November";
			case 12 -> "December";
			default -> "Invalid month";
		};
		System.out.println("Month: " + monthName);
	}
}
