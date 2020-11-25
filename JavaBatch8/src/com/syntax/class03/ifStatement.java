package com.syntax.class03;

public class ifStatement {

	public static void main(String[] args) {


		int num1=1800;
		int num2=900;
		if (num1>num2){
			System.out.println("num1 is bigger than num2");
				
		}else System.out.println("num1 is smaller than num2");
		
		System.out.println("---------------------------");
		
		int temp=60;
		if (temp>=60) {
			System.out.println("i am going to the beach");
		}else {
			System.out.println("I will go for the walk");
		}
		System.out.println("---------------------------");
		
		double expectedHours=20;
		double actualHours=8;
		if(actualHours>expectedHours) {//true
			System.out.println("you will love the cource and you will succed");
		}else //false
			System.out.println("cource will be to hard for ypu");
		
		System.out.println("---------------------------");
		
		
		
	}

}
