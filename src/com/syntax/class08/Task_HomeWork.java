package com.syntax.class08;

import java.util.Scanner;

public class Task_HomeWork {

	public static void main(String[] args) {
//1 Print numbers from 1 to 50 except those that are divisible by 3
//2 Create a program that will keep asking user to apply for a credit card. 
//		As soon you get “yes” from a user program should stop asking.
//3 Write a program that reads a range of integers (start and end point), 
//		provided by a user and then from that range prints the sum of the even and odd integers.
//4 Write a program to ask a user to enter item they want to buy and the price of that item. 
//		Every time user enters money accumulate the amount and tell the user how much is left to pay off. If user give more money program should return a change. Whenever a user done with payments program should say “Thank you for shopping!”

		System.out.println("***********Print numbers from 1 to 50 except those that are divisible by 3***********");
		/*double num1 = 3;
		double div;
		for (double i = 1; i <= 50; i++) {
			div = i / num1;
			System.out.println(i + " / " + num1 + " = " + div);
		}
		// second way teachers
		System.out.println("// second way teachers");
		*/for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(
				"***********Create a program that will keep asking user to apply for a credit card. As soon you get “yes” from a user program should stop asking.***************");
		Scanner input;
		input = new Scanner(System.in);
		/*
		boolean yes = true;
		System.out.println("Do you want to apply for a credit card");
		yes = input.nextBoolean();

		while (!yes) {
			if (yes) {
				System.out.println("Do you want to apply for a credit card");
				yes = input.nextBoolean();
			} else {
				System.out.println("Do you want to apply for a credit card");
				yes = input.nextBoolean();
			}
		}

		System.out.println("Enjoy with your new Credit card");

		// second way teachers
		System.out.println("// second way teachers");
		*/
		String response;
		do {

			System.out.print("Do you want to apply for credit card ");
			response = input.nextLine();

		} while (!response.equalsIgnoreCase("yes"));

		System.out.println("You are selected ");

		System.out.println(
				"**************Write a program that reads a range of integers (start and end point), provided by a user and then from that range prints the sum of the even and odd integers.***************");
		System.out.println("Please enter start number");
		int startPoint = input.nextInt();
		
		System.out.println("Please enter end number ");
		int endPoint = input.nextInt();
		
		int sumE = 0, sumO = 0;

		for (int i = startPoint; i <= endPoint; i++) {
			if (i % 2 == 0) {
				sumE += i;
			}
			if (i % 2 != 0) {
				sumO += i;
			}
		}
		System.out.println("sumE is " + sumE);
		System.out.println("sumO is " + sumO);


		System.out.println("***4******");
		System.out.println("Write a program to ask a user to enter item they want to buy and the price of that item. Every time user enters money accumulate the amount and tell the user how much is left to pay off. If user give more money program should return a change. Whenever a user done with payments program should say “Thank you for shopping!");
		/*System.out.println("Please enter what item you're buying and price.");
		String item = input.nextLine();
		double price = input.nextDouble();
		System.out.println("Please enter how much you will pay.");
		double payment = input.nextDouble();
		double balance = price - payment;
		for (double a = payment; a <= price; a--) {
			if (payment != price) {
				System.out.println("You owen " + balance);
				break;
			} else if (payment == price) {
				System.out.println("Enjoy your " + item);
				break;
			} else if (payment > price) {
				System.out.println("Please enter valid amount");
			}
		}
*/
		
		System.out.println("What do you want to buy");
		String item=input.next();
		
		System.out.println("Please enter the price");
		double price = input.nextDouble();
		System.out.println("Please enter how much you will pay.");
		double payment = input.nextDouble();
		while (payment != price) {
			if(payment < price) {
				System.out.println("Not enought money");
				payment = input.nextDouble();
			}else {
				System.out.println("Please insert less money");
				payment = input.nextDouble();
			}
		}
		System.out.println("Enjoy your " + item);
		
		
	}

}
