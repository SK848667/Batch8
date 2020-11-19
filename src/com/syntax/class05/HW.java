package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		Scanner scan;
		//boolean answer;
		String answer;
		double balance;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter if you have credit card (true/false)");

		//answer = scan.nextBoolean();
		answer = scan.next();
		
		//if (answer) {
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on your credit card?");
			balance = scan.nextDouble();
			
			if (balance > 1000) {
				System.out.println("Please pay off your card balance");
			} else {
				System.out.println("You can spend more $$");
			}

		} else {
			System.out.println("Woild you like to get a credit card?");
		}
		
		

	}

}
