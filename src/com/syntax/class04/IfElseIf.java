package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		// need to compare 2 numbers(bigger,smaller or equal
		int num1 = 19;
		int num2=9;
		if (num1>num2) {//what if this condition true
			System.out.println(num1+" is bigger than "+num2);
		}else if(num1<num2) {//or if condition is true
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println(num1+" is equal than "+num2);
		}
		System.out.println("******************************************");
		
		//slass schedule
		
		int day=7;
		if(day==1) {
			System.out.println("Today is Monday we have no class");
		}else if (day==2) {
				System.out.println("Today is Tusday we have Manual class");
		}else if (day==3) {
				System.out.println("Today is Wednesday we have Manual class");
		}else if (day==4) {
				System.out.println("Today is Thursday we have Review class");
		}else if (day==5) {
			System.out.println("Today is Friday we have no class");
		}else if (day==6) {
			System.out.println("Today is Saturday I miss Java classes");
		}else if (day==7) {
			System.out.println("Today is Sunday I did a lot of coding");
		}else {
			System.out.println("This is invalid day of a week");
		}
		
		
		
	}

}
