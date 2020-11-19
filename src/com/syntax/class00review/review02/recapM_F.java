package com.syntax.class00review.review02;

import java.util.Scanner;

public class recapM_F {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your gender: M or F ");
		char gender=scan.next().charAt(0);
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		if (gender == 'M') {
		 if (age>=25) {
		  System.out.println("Man");
		}else {
			 System.out.println("Boy");
		}}
		
		
		if (gender == 'F') {
		 if (age>=25) {
		  System.out.println("Woman");
		}else {
			 System.out.println("Girl");
		}}
		
		/*For you to do: 
Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"

You have 2 conditions:
If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"

Example Output: 
Please enter your gender: M or F
Please enter your age
Man

Example Output: 
Please enter your gender: M or F
Please enter your age
Boy

Example Output: 
Please enter your gender: M or F
Please enter your age
Woman

Example Output: 
Please enter your gender: M or F
Please enter your age
Girl
*/
	}

}
		
