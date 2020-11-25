package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] grade = {'A', 'B', 'C', 'D', 'E', 'F', 'H'};
		char sendValue=grade[1];
		
		String[] names = {"Mike", "Burju", "Jack", "Danilo", "Brian","Evgenia"};
		String secondVal=names[1];
		
		for(int i=0; i<grade.length; i++) {
			char valueFromArray=grade[i];
			System.out.println(valueFromArray);

		}
		
		System.out.println("*******************************");	
		
		

	}

}
