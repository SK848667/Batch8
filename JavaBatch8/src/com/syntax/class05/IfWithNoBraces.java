package com.syntax.class05;

public class IfWithNoBraces {

	public static void main(String[] args) {
		boolean isSaurday = false;
		if (isSaurday)
			System.out.println("Today is a Java class");//if no braces only 1 live will be treated as code if block
		//else
			System.out.println("Today is not Saturday");//this code does not belong to the if stamement (because no braces)

		
		System.out.println("And tomorrow I will have a Java clasa");
		System.out.println("I am a code outside of the statement");
	}

}
