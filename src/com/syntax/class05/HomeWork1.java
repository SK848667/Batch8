package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * 1 Write a program to find largest of three double values using if-else..if
		 * and logical operators provided by a user (numbers must be distinct)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three numbers");
		double num1, num2, num3, large;
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		

		if (num1 > num2 && num1 > num3) {
			large = num1;
		} else if (num2 > num1 && num2 > num3) {
			large = num2;
		} else {
			large = num3;
		}
		System.out.println("the lager number is " + large);

	}

}
