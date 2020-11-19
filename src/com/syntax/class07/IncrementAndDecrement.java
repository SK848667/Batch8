package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		/*
		 * For you to do: Step 1: Initialize the i value as int i=7. 
		 * Step 2: Write a program to print a sequence of numbers starting from 7 to 98. 
		 * Output:7 14 21 28 35 42 49 56 63 70 77 84 91 98
		 */
		int i = 7;
		System.out.println(i);
		while (i < 98) {
			i += 7;
			System.out.println(i);
		}
		
		
		System.out.println("***********************************************");
		
		int num = 10;
		num = num + 1;
		num += 1;
		System.out.println(num);
		num++;// adding 1
		System.out.println(num);

		System.out.println("***********************************************");

		int num1 = 100;

		num1 -= 1;
		num1--;// suntract 1
		System.out.println(num1);

		// 100--; CE
		// increment and decement operators can be used ONLY with variables

		System.out.println("***********************************************");

	}

}
