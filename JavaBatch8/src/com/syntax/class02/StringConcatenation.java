package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {		
	//public static void main (String[] arg) {

		String name = "Olga";
		//I would like to say my name is Olga
		System.out.println("My name is "+name);
		
		String lastName= "Sorrels";
		//print Olga Sorrels
		System.out.println(name+" "+lastName);
		
		String city="Miami";
		//olga Lives in Miami
		System.out.println(name+" lives in "+city);
		
		char grade ='B';
		//Olga is B student
		System.out.println(name+" is "+grade+" student");
		
		int age=21;
		//olga is 21 year old
		System.out.println(name+" is "+age+" year old");
		//to attach/concatenate ANY value (var, int, string, double) we use +
		
		String state="DC";
		String anotherState="DC ";
		System.out.println(state);
		System.out.println(anotherState);
		// state and anotherState not the same - spase its a character as well 
		//name id 2characters and another State is 3characters in double quotes ONLY
		
		
		
		
	}

}
