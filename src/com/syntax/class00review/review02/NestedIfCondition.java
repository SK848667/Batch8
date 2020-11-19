package com.syntax.class00review.review02;

import java.util.Scanner;

public class NestedIfCondition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String gender=scan.next();
		//System.out.println("Please enter your age");
		String name="Asghar";
		String pass="pass123";
		double accountBalance=10.25;
		double transferAmount=8;
		//boolean transferAlloed=true;
		if (pass.equals("pass123")) 
		if (name.equals("Asghar")){
			System.out.println("Welcome to bank");
			
		}else {
			System.out.println("Invalis username or password");
		}
		
		//if (transferAlloed) {
			System.out.println("Initialing transfer");
			if (transferAmount>accountBalance) {
			System.out.println("transfer completed");	
	}else {
		System.out.println("Invalid amount");
	}


	}

}
