package com.syntax.class11;

public class GroupTask {

	public static void main(String[] args) {
//1 Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
//2 Write a java program to check whether a given number is prime or not?
//3 Write a Java Program to print the first 10 numbers of Fibonacci series.
//4 Maximum and minimum number in the array?
//5 Write a java program to find the second largest number in the array?
//6 Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of all numbers.
//7 Create a 2D array to store numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.
//8 Create a 2D array to store numbers and calculate sum of all odd numbers.
//9 Create an array of countries: north america countries, south america countries, europe countries, asian countries, african countries. Then print all values from that array using 2 different loops and calculate how many total countries been stored.

		System.out.println("*************task1 ? *******************");

		String a = "my";
		String b = "name";
		System.out.println("Before swap: " + a + " " + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After : " + a + " " + b);

		System.out.println("*************task1 ? second way*****************");
		int x = 10;
		int y = 20;
		x = x + y;
		y = x - y;
		x = x - y;
		// System.out.println("After swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);

		System.out.println("*************task2 ? FOR LOOP*****************");
		int prime = 29;
		boolean flag = false;
		for (int i = 2; i <= prime / 2; ++i) {
			// condition for nonprime number
			if (prime % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(prime + " is a prime number.");
		else
			System.out.println(prime + " is not a prime number.");

		System.out.println("*************task2 ? second way WHILE LOOP*****************");
		int prime2 = 33, i = 2;
		boolean flag2 = false;
		while (i <= prime2 / 2) {
			// condition for nonprime number
			if (prime2 % i == 0) {
				flag2 = true;
				break;
			}

			++i;
		}

		if (!flag2) {
			System.out.println(prime2 + " is a prime number.");
		} else {
			System.out.println(prime2 + " is not a prime number.");
		}

		System.out.println("*************task3 ? *****************");
		int n = 10, f1 = 0, f2 = 1;
		System.out.print("First of Fibonacci " + n + " numbers: ");

		for (int i1 = 1; i1 <= n; i1++) {
			System.out.print(f1 + " + ");

			int sum = f1 + f2;
			f1 = f2;
			f2 = sum;
		}
		System.out.println();
		System.out.println("*************task4  *****************");
		System.out.println("Largest");
		int[] mNumber = { 10, 0, 20, 8, -100, 77, 56, -10, 100 };
		int max = mNumber[0];// first largest in array
		int min = mNumber[0];

		for (int i1 = 1; i1 < mNumber.length; i1++) {
			if (mNumber[i1] > max) {//more
				max = mNumber[i1];
			}
		}
		System.out.println("Largest Number is: " + max);

		System.out.println("Smallest");
		for (int i2 = 0; i2 < mNumber.length; i2++) {
			if (mNumber[i2] < min) {//less
				min = mNumber[i2];
			}
		}
		System.out.println("Smallest Number is: " + min);

		System.out.println("*************task5 ? *****************");

		int[] second = { 10, 0, 20, 8, -100, 77, 56, -10, 100 };
		int largest = second[0];
		int secondLargest = second[0];
		for (int i1 = 0; i1 < second.length; i1++) {
		}for (int i1 = 0; i1 < second.length; i1++) {
			if (second[i1] > largest) {
				secondLargest = largest;
				largest = second[i1];
			} else if (second[i1] > secondLargest) {
				secondLargest = second[i1];
			}
		}
		System.out.println("Second largest number is: " + secondLargest);

		
		System.out.println("*************task6  *****************");
		int[][] array = { { 1, 2, 3 }, { 10, 20, 30 }, { 100, 200, 300 } };

		int sums = 0;
		for (int i1 = 0; i1 < array.length; i1++) {
			for (int j = 0; j < array.length; j++) {
				sums += array[i1][j];
			}
		}
		System.out.println("The sum is " + sums);
		

		System.out.println(
				"*************task7 print the even numbers only!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! *****************");
		int[][] array1 = { { 1, 2, 3, 4 }, { 11, 20, 33, 40 }, { 101, 200, 303, 400 } };

		for (int r = 0; r < array1.length; r++) {// loops though rows

			for (int c = 0; c < array1.length; c++) {// loops though columns
				if (array1[r][c] % 2 == 0) {
					System.out.println(array1[r][c] + " is Even numbers ");
				}else {
					System.out.println(array1[r][c] + " is Odd numbers ");
				}
			}

			System.out.println();

		}

		System.out.println("*************task8  sum of all odd numbers!!!!!!!!!!!!!!!!!!!!!!! *****************");
		int[][] array2 = { { 1, 2, 3, 4 }, { 11, 20, 33, 40 }, { 101, 200, 303, 400 }, };
		int arraysize = array2.length;
		int sum = 0;
		for (int i1 = 0; i1 < arraysize; i1++) {
			for (int j = 0; j < array2[i1].length; j++) {
				if ((array2[i1][j]) % 2 != 0) {
					sum += array2[i1][j];
				}
			}
	}
		System.out.println("sum of odd number in array is :" + sum);
		
		
		System.out.println("*************task9*****************");

		String[][] countries = { { "USA", "Mexico", "Canada" }, { "Brazil", "Columbia", "Argentina" },
				{ "Russia", "Turkey", "Germany" }, { "China", "India", "Indonesia" },
				{ "Nigeria", "Ethiopia", "Egypt" }, };
		int size = countries.length;
		int size2 = countries[0].length;
		System.out.println("Size of countries array = " + size * size2);

		for (int i1 = 0; i1 < countries.length; i1++) {
			for (int j = 0; j < countries[i1].length; j++) {
				String countriesvalue = countries[i1][j];
				System.out.print(countriesvalue + "  ");
			}
			System.out.println();
		}
		
	}

}
