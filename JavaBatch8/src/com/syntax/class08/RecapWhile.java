package com.syntax.class08;

import java.util.Scanner;

public class RecapWhile {

	public static void main(String[] args) {
		//ask user for pay for water
		//water price is 5$ (no change)
		//once user enters money then we need to tell if we need more money or less
		//once user gives us exact 5$ then  -> Enjoy your water

		Scanner input;
		double money;
		double waterPrice=5;
		input=new Scanner(System.in);
		
		System.out.println("Please pay for the water");
		money=input.nextDouble();
		
		while (money!=waterPrice) {
			if(money>waterPrice) {
				System.out.println("Ths it too much, you need to enter less money");
				money=input.nextDouble();
			}else {
				System.out.println("Water is expensive, please insert more money");
				money=input.nextDouble();
			}
		}
		
		System.out.println("Enjoy your water");
		
	}

}
