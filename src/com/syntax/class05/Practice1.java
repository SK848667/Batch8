package com.syntax.class05;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// Write a program to ask user to enter numbers of worked years and annual salary. 
		//If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
		//Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		Scanner input; 
	  	 
		input=new Scanner(System.in);
		double years, salary;
		System.out.println("Please enter the number of worked years");
		years=input.nextDouble();
		
		if(years>=5) {
			System.out.println(" you are eligible for bonus");
			
			System.out.println("Please eneter your salary");
			salary=input.nextDouble();
			if(salary>50000) {
				System.out.println("your will recive 5000 bonus");
				
			}
			else {
				System.out.println("you will recive 3000 bonus");
			}
		}
		else {
			System.out.println("you are not eligible for bonus");
		}
	  	  

	}

}
