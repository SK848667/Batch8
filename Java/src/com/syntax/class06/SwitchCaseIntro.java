package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number");
		int day = scan.nextInt();
		String today;
		
		switch (day) {//datatype of variable must match with datatype of cases
		
		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tusday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;

		default:
			today = "Invalid Day";
			//break;// is optional since it is a last statement in the switch statement
		}
		System.out.println("Today is "+ today);
	}

}
