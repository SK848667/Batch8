package com.syntax.class10;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

//Create an array of animals and store 6 elements into it. Using 2 different loops print all elements from the array.
//Create an array on double using scanner and calculate the total of all elements that was stored in an array.
//Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).

		System.out.println("***************task1*******************");
		String[] animals = { "Dog", "Cat", "Rabbit", "Cow", "Horse", "Chiken" };
		for (String a : animals) {
			System.out.print(a + ", ");
		}
		System.out.println();
		System.out.println("*****task1 second way***********");
		String[] animals2 = new String[6];
		animals2[0] = "Dog";
		animals2[1] = "Cat";
		animals2[2] = "Rabbit";
		animals2[3] = "Cow";
		animals2[4] = "Horse";
		animals2[5] = "Chiken";
		for (int i = 0; i < animals2.length; i++) {
			System.out.print(animals2[i] + ", ");
		}

//Task 2
		System.out.println();
		System.out.println("***************task2*******************");
		
		Scanner scan = new Scanner(System.in);
		double[] arr;
		double total = 0;
		int size;
		
		System.out.println("How many elements would you like to store");
		size=scan.nextInt();
		arr = new double[size];
		
		for (int d = 0; d < size; d++) {
			System.out.println("Enter the element:");
			arr[d] = scan.nextDouble();
		}
		for (double num : arr) {
			total = total + num;
		}
		System.out.println("total of array elements is: " + total);

		
		
		//Task 3
				System.out.println();
				System.out.println("***************task3*******************");
				String[] country = new String[5];
				country[0] = "usa";
				country[1] = "ukraine";
				country[2] = "belarus";
				country[3] = "russia";
				//int size=country.length;

				for (int i = 0; i < country.length; i++) {
					System.out.print(country[i] + ", ");
				}
				System.out.println();
				System.out.println("***************task3 Second way*******************");

				String[] country2 = { "usa", "ukraine", "belarus", "russia",};
				country2[0] = "Washinton dc";
				country2[1] = "kiev";
				country2[2] = "minsk";
				country2[3] = "moskow";
				for (String a : country2) {
					System.out.print(a + ", ");
				}
	}

}
