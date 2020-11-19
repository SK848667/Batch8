package com.syntax.class11;

import java.util.Scanner;

public class HWrecap {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it. Using 2 different
		// loops print all elements from the array.
		System.out.println();
		System.out.println("-------------------task1-----------------------------------");
		String[] animals = { "Lion", "Tiger", "Panther", "Gorilla", "Cheeta", "Liger" };

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		System.out.println("-------------------task1 seconda way----------------------------------");
		for (String anml_name : animals) {
			System.out.print(anml_name + " ");
		}

		System.out.println();
		System.out.println("-------------------task2----------------------------------");

		Scanner scan;
		double[] num;
		double sum = 0;
		int size;
		scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to add up?");
		size = scan.nextInt();
		num = new double[size];
		// store numbers into array
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter double numbers");
			num[i] = scan.nextDouble();
		}
		// first way

//		//loop through created array
//		for (int i = 0; i < num.length; i++) {
//			sum = sum + num[i];
//		}

		// Second way
		for (double number : num) {
			sum += number;
		}

		System.out.println(sum);

		System.out.println();
		System.out.println("-------------------task3----------------------------------");

		String[] countries = { "USA", "Ukraine", "Canada"};
		//String[] capitals = { "DC", "Kyiv", "Ottawa" };
		//for (int v = 0; v < countries.length; v++) {
		//	System.out.println("The capital of " + countries[v] + " is " + capitals[v]);
		//}

		System.out.println();
		System.out.println("-------------------task3 Better way----------------------------------");
		String capital;
		for (String country : countries) {
			switch (country) {

			case "USA":
				capital = "DC";
				break;
			case "Ukraine":
				capital = "Kyiv";
				break;
			case "Canada":
				capital = "Ottawa";
				break;
			default:
				capital = "UnKnown";
			}
			System.out.println("The capital of "+ country+" is "+capital);
		}

	
	
	
	
	
	
	
	
	
	
	
	}

}
