package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// Write a program to find largest number among three numbers using nested if
		// provided by a user (numbers must be distinct)
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three numbers");
		double num1, num2, num3, large;
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		scan.close();
//1st way
		if (num1 > num2 && num1 > num3) {
			large = num1;
		} else if (num2 > num3) {
			large = num2;
		} else {
			large = num3;
		}
		System.out.println("the lager number is " + large);
//2nd way
		double biggest;
		if (num1 > num2) {//if num1 larger than num2
			if (num1>num3)	{
				biggest=num1;
			}else {
				biggest=num3;
			}
		}else {//num2 is larger than num1
			if (num2 > num3) {
				biggest=num2;
			}else {
				biggest=num3;
			}
		}
		System.out.println("the lager number is " + biggest);

	}

}
