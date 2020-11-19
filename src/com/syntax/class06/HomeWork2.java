package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2HomeWork: Using scanner class create calculator. Allow user to enter 2
		 * numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 */
		 double firstNumber, secondNumber;
		    Scanner scanner = new Scanner(System.in);
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
		            output = firstNumber + secondNumber;
		            break;
		        case '-':
		            output = firstNumber - secondNumber;
		            break;
		        case '*':
		            output = firstNumber * secondNumber;
		            break;
		        case '/':
		            output = firstNumber / secondNumber;
		            break;
		        case '%':
		            output = firstNumber % secondNumber;
		            break;
		        default:
		            System.out.printf("You have entered wrong operator/number");
		            return;
		    }
		    System.out.println(firstNumber + " " + operator + " " + secondNumber + ": " + output);
	}

}
