package com.syntax.class00review.review01;

import java.util.Scanner;

public class WhileLoopWithSwitch {

	public static void main(String[] args) {

		double num1;
		double num2;
		char operation;
		double results;
		while (true) {
			System.out.println("Please Enter two numbers");
			Scanner scanner = new Scanner(System.in);
			num1 = scanner.nextDouble();
			num2 = scanner.nextDouble();
			System.out.println("Please Enter the operation + - * /");
			operation = scanner.next().charAt(0);
			if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
				System.out.println("Operation not supported");
				continue;
			}
			switch (operation) {
			case '+':
				results = num1 + num2;
				break;
			case '-':
				results = num1 - num2;
				break;
			case '*':
				results = num1 * num2;
				break;
			case '/':
				results = num1 / num2;
				break;
			default:
				results = 0;
			}
			System.out.println("Results are " + results);
			System.out.print("Enter Yes to perform more operations and No to terminate the program");
			if ("No".equals(scanner.next())) {
				break;
			}
		}
		
		
	}

}
