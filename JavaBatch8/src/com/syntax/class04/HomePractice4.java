package com.syntax.class04;

import java.util.Scanner;

public class HomePractice4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	 	  /*
Write a program to find the largest number among three distinct numbers using nested if condition
Please use Scanner class to take input from users
Expected Output:
Please enter 3 distinct numbers
The largest number is 14
	 	  */
	  	  System.out.print("Please enter 3 distinct numbers");
	  	  int n1=scan.nextInt();
	  	  int n2=scan.nextInt();
	  	  int n3=scan.nextInt();
      if( n1 >= n2 && n1 >= n3)
          System.out.println("The largest number is "+n1);

      else if (n2 >= n1 && n2 >= n3)
          System.out.println("The largest number is "+n2);

      else
          System.out.println("The largest number is "+n3);

	}

}
