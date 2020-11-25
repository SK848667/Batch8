package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * 1Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		String language;
		
		
		System.out.println("what is your country name?");
		String country = scan.nextLine();
		
		switch (country.toLowerCase()) {
		
		case"ukraine":
			language="Ukrainian";
			break;
		case"russia":
			language="Russian";
			break;
		case"afghanistan":
			language="Dari";
			break;
		case"pakistan":
			language="Urdu";
			break;
		case"usa":
			language="English";
			break;
		default:
			language="not valid";
			break;
		}
System.out.println("You are from "+country+" and your language is "+language);
	}

}
