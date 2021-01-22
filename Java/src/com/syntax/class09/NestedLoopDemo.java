package com.syntax.class09;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {//outer loop (how many time will be loop)
			System.out.println("Hello");
			for (int y = 0; y < 3; y++) {//inner loop (
				System.out.println("Bye");
		}
			System.out.println("*********************");
	}

		
		
		
		int total;
		for (int i = 1; i <= 10; i++) {
			//System.out.println(i);
			for (int j = 1; j <=10; j++) {
				total=i*j;
				System.out.println(i+ " x " +j+" = "+total);
		}
			System.out.println("*********************");
	}
		
		//how to print numbers from 10to 99 using nested loop
		System.out.println("*******10 to 99 using nested loop******************");
		for (int i = 1; i <=9; i++) {
			
			for (int j = 0; j <=9; j++) {
				System.out.println(i+""+j);
		}
			//System.out.println("*********************");
	}
		

		
}
}