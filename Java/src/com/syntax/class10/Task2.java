package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Print all values from the array.
		String[] cars = new String[6];
		cars[0] = "BWM";
		cars[1] = "Toyota";
		cars[2] = "Honda";
		cars[3] = "Mazda";
		cars[4] = "Audi";
		cars[5] = "Lexus";
		for(int i=0; i <cars.length; i++) {
		System.out.println(cars[i]);
		}
	}

}
