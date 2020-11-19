package com.syntax.class04;

public class Practice2 {

	public static void main(String[] args) {
		/*
-Write a program to store a boolean value of whether user has diploma or not. 
 If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
 Then if user has a degree program should check a gpa score. 
 If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, 
 otherwise → “You should have studied harder” .
-Create a Java program and store values of mortgage rate and mortgage price. 
First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying. 
Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, 
otherwise user will pay cash.
		 */
		boolean diploma=true;
		double gpa=3.5;
		if(diploma) {//if user has diploma we do futher check of gpa
			System.out.println("Congratulations");
			if(gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else  {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("Get a degree");
		}
		
		System.out.println("*****************************************");
			
		double rate =3.2;
		double price = 300000;
		if (rate > 4.5 ) {
			System.out.println("You can not buy a house");
		} else {
			if (price > 200000) {
				System.out.println("I need to get a loan");
			} else {
				System.out.println("I will pay cash.");
			}
		}
		System.out.println("*****************************************");	
	}

}
