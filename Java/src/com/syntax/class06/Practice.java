package com.syntax.class06;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a grade");
		char grade;
		grade = scan.next().charAt(0);
		String score;
		
		switch (grade) {
		
		case 'A':
			score = "Excellent";
			break;
		case 'B':
			score = "Good";
			break;
		case 'C':
			score = "Average";
			break;
		case 'D':
			score = "Bad";
			break;
		
		default:
			score = "Not Acceptable";
			
		}
		System.out.println("Your score is "+ score);
	}

}
