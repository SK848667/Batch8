package com.syntax.class04;

import java.util.Scanner;

public class HomePractice {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		//double celsius, fahrenheit;

		System.out.println("Please enter your city and the temperature");
		String city=scan.next();
		double fahrenheit=scan.nextDouble();
		double celsius=(fahrenheit-32)*5/9;
		System.out.println("The temerature in the city "+city+" is "+celsius);
		
		System.out.println("***************************************");
		
		  	System.out.print("In:");
		  	int num = scan.nextInt();
		  	
		  	if (num >0) {
					System.out.println(num+" is positive");
				} else if (num <0) {
					System.out.println(num+" is negative");
				} else {
					System.out.println("Entered number is equals to 0");
				}
		
		  	 
		


	}

}
