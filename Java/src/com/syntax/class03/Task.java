package com.syntax.class03;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
Create a Java program and name it Double Comparison. 
Declare 2 double values and if value of first variable is higher then the second, print “Double value __ is larger than __ .” 
Otherwise print...

Create a Java program and name it Temperature Check. Create variable to store temperature. 
Your program should check if temperature is below 32 then it should print “Water will freeze with temperature __“, 
otherwise “Water will NOT freeze with temperature __“.
 */
		double num1=5;
		double num2=9;
		if(num1>num2) {
			System.out.println("Double value "+num1+" is larger than "+ num2+" .");
		}else 
			System.out.println(num2 + " lager then" + num1);
		
		System.out.println("************************************");
			

		double temp=32;		
				if (temp<32) {
					System.out.println("Water will freeze with temperature");
				}else {
					System.out.println("Water will NOT freeze with temperature ");
				}
				
				System.out.println("************************************");	
				
				boolean hungry=false;
				if (hungry) {
					System.out.println("i will go eat");//true
				}else {
					System.out.println("i will continue studyng");//false
				}
				System.out.println("************************************");	
				
				boolean hungry2=true;
				if (hungry2) {
					System.out.println("i will go eat");//true
				}else {
					System.out.println("i will continue studyng");//false
				}
				
	}

}
