package com.syntax.class06;

import java.util.Scanner;

public class NotOperator {

	public static void main(String[] args) {
		boolean b=!true;
		System.out.println(b);
		
		boolean anotherBoolean=!false;
		System.out.println(anotherBoolean);
		
		System.out.println("***********************************************************");

		boolean isCold=true;
		if(!isCold) {
			System.out.println("I am going to the beach");
		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three numbers");
		double num1, num2, num3, large = 0;
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		scan.close();

		
		if (num1!=num2 && num2!=num3){
		if (num1 > num2 && num1 > num3) {
			large = num1;
		} else if (num2 > num3) {
			large = num2;
		} else {
			large = num3;
		}
		System.out.println("the lager number is " + large);
		}else {
			System.out.println("numbers are equal");
		}
		
	}

}
