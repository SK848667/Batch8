package com.syntax.class05;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 60 inch) medium(between 60
		 * -72 inch) tall (over 72 inch)
		 ************************
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a
		 * weekend”, any other day → output “Invalid day”
		 */
		Scanner input;
		int number;
		input = new Scanner(System.in);
		System.out.println("Please enter your heights in inches");
		number = input.nextInt();
		if (number>0 && number<=60) {
			System.out.println("You are short");
		}else if(number>60 && number<=72) {
			System.out.println("You are medium");
		}else if(number>72) {
			System.out.println("You are tall");
		}else {
			System.out.println("wrong amount");
		}
		System.out.println("***********************************");
		
		System.out.println("Please enter today day using numbers only from 1 to 7");
		int today=input.nextInt();
		if (today>0 && today<=5) {
			System.out.println("It is a weekday");
			}else if (today>5 && today<=7) {
				System.out.println("It is weekend");
			} else {
				System.out.println("Invalid day");
			}
		
		
	}

}
