package com.syntax.class07;

public class SwitchTest {

	public static void main(String[] args) {
		String timeOfDay = "Noon";
		String day = "Saturday";

		switch (timeOfDay) {

		case "Morning":
			System.out.println("Good Morning");

//			if (day.equalsIgnoreCase("Saturday")) {
//				System.out.println("Class");
//			}else if (day.equalsIgnoreCase("Monday")) {
//				System.out.println("Colleague");
//			}

			switch (day) {
			case "Monday":
				System.out.println("Colleague");
				break;
			case "Thurday":
				System.out.println("Asghar");
				break;
			case "Saturday":
				System.out.println("Class");
				break;
			}

			break;
		case "Noon":
			System.out.println("Good Afternoon");
			break;
		case "Evening":
			System.out.println("Good Evening");
			break;
		case "Night":
			System.out.println("Good Night");
			break;
		default:
			System.out.println("N/A");

		}

	}

}
