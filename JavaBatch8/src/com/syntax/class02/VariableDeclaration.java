package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		//1 way to create the variable
		//create variable = assigning value
		//declare variable = initializing
		double $num=12.99;
		
		//2 way to create a variable
			//declare or create a variable
			//initialize or assigning value
		int myBox;//we declare variable only once(declaration)
		myBox=135;//assigning value
		System.out.println(myBox);
		
		myBox=155;//reassigning value
		System.out.println(myBox);
		
		//3 way
		int num1, num2, num3;//if variable is of same time, we can declarate all in one line
		num1=10;
		num2=20;
		num3=30;
		System.out.println(num1);
		
	    int first = 200;
	    int second = 100;
	    System.out.println(first+second);
	    System.out.println(first-second);
	    System.out.println(first*second);
	    System.out.println(first/second);
	

}
}