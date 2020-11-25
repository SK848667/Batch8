package com.syntax.class08;

public class ForLoopDemo {

	public static void main(String[] args) {
		//i want to say Good Morning 5 times
		/*
		 * FOR SYNTAX 
		 * for (initialization; condition; increment/decrement { 
		 * code; 
		 * }
		 */
		//-----1-------2-----4--------
		for (int i=5; i<10; i++) {
			System.out.println("Good Morning");//5
		}
		
		
		//i want to print numbers 1 to 100
		/*
		 * FOR SYNTAX 
		 * for (start point; end point; increment/decrement { 
		 * code; 
		 * }
		 */
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		System.out.println("*************************");
		////i want to print numbers 10 to 0
		for(int i=10; i>=0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("*************************");
		//
		for(int i=0; i<=30; i+=3){
			System.out.print(1+" ");
			
			
			System.out.println();
			System.out.println("*************************");
			
			
			
			
			
		}

	}

}
