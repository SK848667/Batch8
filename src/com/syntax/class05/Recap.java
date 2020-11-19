package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		Scanner scanner;
		scanner=new Scanner(System.in);
		//i want to capture sentence
		System.out.println("Entered sentence: ");
		String sentence=scanner.nextLine();
		System.out.println("You entered sentence: "+sentence);
		
		//I want to capture number
		System.out.println("Entered any number: ");
		int number=scanner.nextInt();
		System.out.println("You entered sentence: "+number);
		
		//I want to capture 1word
		System.out.println("Entered any word: ");
		String word=scanner.next();
		System.out.println("You entered sentence: "+word);
		
		//I want to capture 1 character
		System.out.println("Entered any single character: ");
		char singleCharacter=scanner.next().charAt(0);
		System.out.println("You entered sentence: "+singleCharacter);
		
		
		

	}

}
