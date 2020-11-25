package com.syntax.class06;

import java.util.Scanner;

public class Nested_IF2 {

	public static void main(String[] args) {
		String pass;
		double accountBalance = 1000;
		Scanner scan = new Scanner(System.in);
		double transferAmount;
		System.out.println("Welcome to Syntax Please Enter your password");
		pass = scan.nextLine();
		if ("pass123".equals(pass) || pass.equals("pass123")) {
			System.out.println("Please enter the amount that you want to transfer");
			transferAmount = scan.nextDouble();
			if (transferAmount > accountBalance) {
				System.out.println("Not enough funds");
			} else {
				System.out.println("Transfered remaining balance " + (accountBalance - transferAmount));
			}
		} else {
			System.out.println("Sorry try again Invalid credentials");
		}

	}

}
