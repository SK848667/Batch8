package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//System.out.println("is it raining? TRUE or FALSE");
		
		//boolean rain=input.nextBoolean();
		//if(rain) {
			//System.out.println("Please take an Umbrella");
		//}else {
			//System.out.println("ITs a nice Weather");
		//}
		System.out.println("**********************");
		
		System.out.println("please enter your name");
		String name=input.next();
		
		System.out.println("please enter your age");
		int age=input.nextInt();
		
		System.out.println("Your name is " +name+" and you are " +age+" years old");
	}

}
