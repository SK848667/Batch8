package com.syntax.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		String[] names = {"Mike", "Burju", "Jack", "Danilo", "Brian","Evgenia"};
		System.out.println(names[3]);//Danilo
		//how do i know how many elements i have in the array
		int size=names.length;
		System.out.println("Size of names array = "+size);
		
		System.out.println(names[names.length-2]);//Danilo
		int a=2;
		System.out.println(names[a]);//jack
		a+=2;
		System.out.println(names[a]);//Brian
		
		System.out.println("****************************");
		
		for(int i=0; i<names.length; i++) {//names index 6 (0.1.2.3.4.5) bc 6 names in list
			//CAN NOT USE = with <=
			System.out.println(names[i]);//will show all 6 names
		}
		
		System.out.println("****************************");


		
		
		

		
		
		
}
}
