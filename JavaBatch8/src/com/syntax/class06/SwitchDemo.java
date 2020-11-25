package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// ask a tester on which browser they would like to use
		Scanner scan;
		String browser;
		String message;
		scan=new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser=scan.nextLine();
		
		switch (browser.toLowerCase()) {//toLowerCase or toUpperCase(with auto change your typed text)
		case "safari":
			message="Your code will be executed on Safari browser";
			break;
		case "chrome":
			message="Your code will be executed on chrome browser";
			break;
		case "firefox":
			message="Your code will be executed on firefox browser";
			break;
			default:
			message = "Entered browser is not supported";
		}
		 System.out.println(message);
		 

		 
		 

	}

}
