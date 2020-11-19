package com.syntax.class04;

import java.util.Scanner;

public class HomePractice3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your gender: M or F");
		String gender=scan.next();
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		
		if (gender.equals("M")){
		}else if (age>25) {
		  System.out.println("Woman");
		}else {
			 System.out.println("Girl");
		}
	
		
		
		if (gender.equals("F")){
		}else if (age>25) {
		  System.out.println("Man");
		}else {
			 System.out.println("Boy");
		}
		

	}

}
