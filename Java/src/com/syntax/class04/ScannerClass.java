package com.syntax.class04;
//shortcut to import ctrl+shift+O
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		//Scanner scan = new Scanner(System.in);//enablr inpute to the console
		//i am addint some message tu user
		//System.out.print("Please add any text:");
		//String value=scan.nextLine();//waits for your input ance you provided inpute you need pute ENTER
		//System.out.println("I captured String value = "+value);
		
		//System.out.print("Please enter your name:");
		//String name=scan.nextLine();
		//System.out.println("Nice to meet you "+name);
		//System.out.println("Please enter your name:");
	    //String name=scan.nextLine();		
	    
		//System.out.println("Please enter your last name:");
	    //String lastName=scan.nextLine();		
	    
	    
		//System.out.println(name+" "+lastName);
	  	  Scanner scan = new Scanner(System.in);
	  	  System.out.print("Please enter a number");
	  	  int num=scan.nextInt();
			
	  	  if (num % 2 == 0 ) {
				System.out.println("Value is even");}
			if(num % 2 != 0) {
				System.out.println("Value is odd");}
			else if(num>1000) {
				System.out.println("Even value is large");
				}else{
				  System.out.println("Even value is just right");
			}
}
}
