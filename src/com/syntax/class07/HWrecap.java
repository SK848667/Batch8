package com.syntax.class07;

import java.util.Scanner;

public class HWrecap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double firstNumber, secondNumber;
		
		System.out.print("Please enter first number:");
		firstNumber = scanner.nextDouble();
		
		System.out.print("Please enter second number:");
		secondNumber = scanner.nextDouble();
		
		System.out.print("Please enter an operator (+, -, *, /, % (mod)): ");
		char operator = scanner.next().charAt(0);
		scanner.close();
		
		double output;
		
		switch (operator) {
		case '+':
			output = (firstNumber + secondNumber);
			break;
		case '-':
			output = (firstNumber - secondNumber);
			break;
		case '*':
			output = (firstNumber * secondNumber);
			break;
		case '/':
			output = (firstNumber / secondNumber);
			break;
		case '%':
			output = (firstNumber % secondNumber);
			break;
		default:
			System.out.printf("You have entered wrong operator/number");
			return;
		}
		System.out.println(firstNumber + " " + operator + " " + secondNumber + ": " + output);

	}

}
