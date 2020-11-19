package com.syntax.class10;

public class AllValueFromArray {

	public static void main(String[] args) {

		String[] cars = { "Honda", "Acura", "Toyota", "Mersedes", "BMW" };
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + ", ");
		}
		System.out.println();

		// Getting value from array using enhanced for loop
		System.out.println("****************************************************************************");
		System.out.println();
		System.out.println("*************Getting value from array using enhanced for loop*************");
		for (String car : cars) {
			System.out.print(car+" ");
		}

		System.out.println();
		System.out.println("***************************************************************************");
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		int[] numbers= {10,20,30,40,50};
		for(int total:numbers) {
			System.out.println(total);
		}
		System.out.println("****************************************************************************");
		boolean[] arrayOfBoolean= {true,true,false,true};
		for (boolean boo:arrayOfBoolean) {
			System.out.println(boo);
		}
		
		System.out.println("****************************************************************************");

	}

}
