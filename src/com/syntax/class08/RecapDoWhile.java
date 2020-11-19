package com.syntax.class08;

import java.util.Scanner;

public class RecapDoWhile {

	public static void main(String[] args) {
		Scanner input;
		double money;
		double waterPrice = 5;
		input = new Scanner(System.in);
		System.out.println("Please pay for the water");
		do {
			money = input.nextDouble();
			if (money > waterPrice) {
				System.out.println("Ths it too much, you need to enter less money");
				// money = input.nextDouble();
			} else if(money < waterPrice) {
				System.out.println("Water is expensive, please insert more money");
				// money = input.nextDouble();
			}
		} while (money != waterPrice);
		System.out.println("Enjoy your water");

	}

}
