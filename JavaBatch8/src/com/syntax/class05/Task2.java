package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in June, July or August → season
		 * =”Summer”. At the end of the program we should see output as “You were born
		 * ______”.
		 */
		Scanner scan;
		String month;
		scan = new Scanner(System.in);

		System.out.println("Please, enter your birth month");
		month = scan.next();

		if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("You were born in Summer");
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("You were born in Fall");
		} else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("You were botn in Winter");
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("You were born in Spring");
		} else {
			System.out.println("Invalid input");
		}
	}

}
