package com.syntax.class04;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
			/*
You are a loan specialist and you need to ask user what is the amount of loan is needed.
If loan is less or equal to 200,000 then you would lend the money 
 otherwise you would reject the client.
			*/

			Scanner scan=new Scanner(System.in);
			
			System.out.println("What is the amount of loan you need?");
			int loan=scan.nextInt();
			if(loan<=200000) {
			System.out.println("I will lend you the money");
			}else {
			System.out.println("I have to reject you loan request");
			}

			/*
You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them, 
otherwise you will offer them to get a learners permit.
			*/

			System.out.println("What is your age?");
			int age=scan.nextInt();
			if(age>=18) {
			System.out.println("I will issue your driver license");
			}else {
			System.out.println("You need to get learner permit first");
			}

			/*
 Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print 
 “The temperature is the city __ is __”
			 */

			System.out.println("Please enter your city and the temperature");
			String city=scan.next();
			double fahrenheit=scan.nextDouble();
			double celsius=(fahrenheit-32)*5/9;
			System.out.println("The temerature in the city "+city+" is "+celsius);

			}

			}