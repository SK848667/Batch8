package com.syntax.class05;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * You are working in sales and have to calculate commission for the employees;
		 * You need to ask user a sales amount and based on the amount you need to
		 * define their commission if user sold products for more than $10 but less than
		 * 100 --> commission is 10% if sales is more than 100 but less then 200 -->
		 * commission is 20% if sales is more than 200 but less then 500 --> commission
		 * is 30% if sales is more than 500 --> commission is 50% You program should
		 * print How much in commission user will get
		 */
		Scanner input;
		double sales, commission;

		input = new Scanner(System.in);

		System.out.println("Please Enter Sales Amount?");
		sales = input.nextDouble();

		if (sales >= 10 && sales < 100) {
			commission = (sales * 10) / 100;
		} else if (sales >= 100 && sales < 200) {
			commission = (sales * 20) / 100;
		} else if (sales >= 200 && sales < 500) {
			commission = (sales * 30) / 100;
		} else if (sales >= 500) {
			commission = (sales * 50) / 100;
		} else {
			commission = 0;
		}
		System.out.println("You will get $" + commission + " commission.");
		// if you sell more that 1k-> you are an awesome seller
		if (commission > 1000) {
			System.out.println("You are an awesome seller");
		}
	}

}
