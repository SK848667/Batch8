package com.syntax.class07;

public class WhileVsDoWhile {
	public static void main(String[] args) {

		System.out.println("*********** WHILE LOOP******************");
		int a=20;
		while (a<15) {
			System.out.println("Hello");// do smth
			a++;
		}
		System.out.println("******** DO WHILE LOOP******************");
		int b=3;
		do {
			System.out.println("Hi");
			b++;
		}while(b<11);//then check condition
		
		//Using do while loop print numbers from 10 to 20. Must not include the number 20 in the output 
	      int i=10;
	      do{
	        System.out.println(i);
	        i++;
	      }while(i<20);
	      
	      
	      //do while loop that prints out \"Hello World!\" 5 times. 
	      System.out.println("**********prints out \"Hello World!\" 5 times**********");
	  	    int c=5;
		      do{
		        System.out.println("Hello World!");
		        c--;
		      }while(c>0);
		
		
		//Using do while loop print even numbers from 20 to 1
		      System.out.println("********Using do while loop print even numbers from 20 to 1*********");
		      int d=20;
		      do{
		        System.out.println(d);
		        d-=2;
		      }while(d>=1);
		
		
		
	}

}
