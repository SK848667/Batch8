package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		/*
		 * 1 Create an array of chars and store grades into it: A,B,C,D,E,F. Then print
		 * a grade B (use 2 different ways of creating an array).
		 *
		 * 2 Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 * 
		 * 3 Create an array of words: Java, Saturday, day, coding, is. Print the
		 * following sentence using elements of array: “Saturday is Java coding Day”.
		 */

		System.out.println("**************task 1*******************");

		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';
		System.out.println(grades[1]);
		System.out.println("******task 1 ANOTHER WAY*********");
		char[] grade = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grade[1]);
			
		System.out.println("**************task 2*******************");
		String[] name = new String[5];
		name[0] = "Mike";
		name[1] = "Burju";
		name[2] = "Jack";
		name[3] = "Danilo";
		name[4] = "Brian";
		System.out.println(name[1]);
		
		System.out.println("******task 2 ANOTHER WAY*********");
		String[] names = { "Mike", "Burju", "Jack", "Danilo", "Brian" };
		System.out.println(names[1]);
		
		
		System.out.println("**************task 3*******************");

		String[] words = new String[5];
		words[0] = "Java";
		words[1] = "Saturday";
		words[2] = "day";
		words[3] = "coding";
		words[4] = "is";
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);

	}

}
