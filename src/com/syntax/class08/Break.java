package com.syntax.class08;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// break
		/*
		 * for (int i = 1; i < 4; i++) { 
		 * System.out.println("Hello"); 
		 * break; 
		 * }
		 */
		//we want to print numbers from 1 to 10
		// when number is 5 we want to brake the loop
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);

		}
		
		double discount;
		char code = 'B' ;

		switch ( code ) {
		case 'A':
		discount = 0.0;

		case 'B':
		discount = 0.1;

		case 'C':
		discount = 0.2;

		default:
		discount = 0.3;
		}
		System.out.println(discount);
		
		 float fl = 5.3f;
		   if (fl == 5.3) {
		      System.out.println("Both are equal");
		   } else {
		      System.out.println("Both are not equal");
		   }
		
		

		   
		
	}

}
