package com.syntax.class04;

import java.util.Scanner;

public class HomePractice2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	      
        System.out.print("Please enter the length");
		  	int num = scan.nextInt();
		  	System.out.print("Please enter the width");
		  	int num2 = scan.nextInt();
  	
  	  if (num !=num2) {
  	    System.out.println("The shape of your object is rectangle");
  	} else {
		  	System.out.println("The shape of your object is square");
  	}
  	System.out.println("*********************************");

	}

}
