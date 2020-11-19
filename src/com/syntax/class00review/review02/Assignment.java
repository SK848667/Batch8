package com.syntax.class00review.review02;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter 3 distinct numbers");
		   int num1 = scan.nextInt();
		   int num2 = scan.nextInt();
		   int num3 = scan.nextInt();
		  
		   if(num1>num2) {
			   System.out.println("largest is "+num3);
			   
		   }else {
			   num1=num2;
		   }
			   
		   if(num1>num3) {
			   System.out.println("largest is "+num1);
		   }
		   else {
			   System.out.println("largest is "+num3);
		   }
		   
		   
		    }
		}
