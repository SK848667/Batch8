package com.syntax.class00review.review02;

import java.util.Scanner;

public class SwitchHomeWorkCALC {

	public static void main(String[] args) {
		/*
		 * * HomeWork: Using scanner class create calculator. Allow user to enter2 *
		 * numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 */
		int num1;
		int num2;
		char operation;
		int results = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Please enter the operation + - / *");
		operation = scan.next().charAt(0);
		System.out.print("my computer did't wait for my input");
		if (operation == '+') {
			results = num1 + num2;
		} else if (operation == '-') {
			results = num1 - num2;
		} else if (operation == '*') {
			results = num1 * num2;
		} else if (operation == '/') {
			results = num1 / num2;
		} else {
			System.out.print("Invalid operation");
		}
		System.out.println(results);
		switch (operation) {
		case '+':
			results = num1 + num2;
			break;
		case '-':
			results = num1 - num2;
			break;
		case '/':
			results = num1 / num2;
			break;
		case '*':
			results = num1 * num2;
			break;
		default:
			System.out.print("Invalid operation");
		}
		System.out.println(results);
	}
}