package com.syntax.class11;

import java.util.Scanner;

public class GroupTaskAnotherWay {

	public static void main(String[] args) {

		String[] arrayOfCountries = { "North America-Canada", "South America-Brazil", "Europe-France", "Asia-China",
				"Africa-Nigeria" };
		
		System.out.println("------------1st way-----------");
		for (int i = 0; i < arrayOfCountries.length; i++) {
			System.out.println(arrayOfCountries[i] + " ");
		}
		System.out.println();
		int size = arrayOfCountries.length;
		System.out.println("Size of stored countries = " + size);
		System.out.println("------------2d way-----------");
		for (String array : arrayOfCountries) {
			System.out.println(array + " ");
		}
		System.out.println();
		int size1 = arrayOfCountries.length;
		System.out.println("Size of stored countries = " + size1);
	}
	}


