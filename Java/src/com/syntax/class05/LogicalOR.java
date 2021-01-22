package com.syntax.class05;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		
		String day="Saturday";
		if (day.equals("Saturday")||day.equals("Sunday")) {
			System.out.println("Today I have a Java class at Syntax");
		}else {
			System.out.println("wrong amount");
		}
		System.out.println("*******************************************");
		/*
		 * if day is 1 or 5-> i am off from Syntax
		 * if day is 2 or -> DIT classes
		 * if day is 4 -> Review Class
		 * if day 6 or 7 -> Java class
		 * everything else will be invalid day
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter today day using numbers only from 1 to 7");
		
		int today=scan.nextInt();
		if (today==1 || today==5) {
			System.out.println("i am off from Syntax");
			}else if (today==2||today==3) {
				System.out.println("Today is Git class");
			}else if (today==4) {
				System.out.println("Today id Review Class");
			}else if (today==6||today==7) {
				System.out.println("Today is Java class");
			} else {
				System.out.println("Please enter a valid date from 1 to 7");
			}
		
	}

}
