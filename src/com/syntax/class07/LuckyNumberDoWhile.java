package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberDoWhile {

	public static void main(String[] args) {
		// play a lottery where we need enter number from 1 to 20
		// lucky number is 7
		// keep asking a user to enter a number until entered number is lucky number
		Scanner scan;
		int numberFromUser;
		int luckyNumber = 7;
		scan = new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from 1 to 20");
			numberFromUser=scan.nextInt();
		}while(numberFromUser!=luckyNumber);
		System.out.println("You guessed the number right");

	}

}
