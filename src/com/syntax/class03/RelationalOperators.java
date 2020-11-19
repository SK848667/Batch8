package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a==b);//false
		System.out.println(a!=b);//true NOT EQUAL
		
		int x=100;
		int y=90;
		boolean result=x>y;//true
		System.out.println(result);
		result=x==y;
		System.out.println(result);//false

		
		/*
		 * (x==);//compare
		 * (x=y);//assigning value of y to variable x
		 * (x);//90
		 */
		System.out.println("");
		boolean result1=x==y;
		System.out.println(result1);
		
		
		byte num=10;
		byte num1=10;
		boolean boo=num>=num1;
		System.out.println(boo);
		
		
	}

}
