package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {

		System.out.println("******WHILE LOOP***********");


			
			
		int time = 3;
		   while (time > 0) {
					System.out.println("Good day");//3 times
					time--;//if time++; will be // Infinite LOOP
		   }
		
		//I want to print number 1 to 50
		System.out.println("Printing numbers 1 to 50");
		int num=1;
		while (num<=50) {
			System.out.println(num);
			num++;
		}
		
		//I want to print number 10 to 60
				System.out.println("Printing numbers 10 to 60");
				int num2=10;
				while (num2<=60) {
					System.out.println(num2);
					num2++;
				}

				//I want to print number 100 to 60
				System.out.println("Printing numbers 100 to 60");
				int num3=100;
				while (num3>=60) {
					System.out.println(num3);
					num3--;
				}
				
				//I want to print number only 10 to 30 only even numbers
				System.out.println("Printing numbers only 10 to 30 only even numbers");
				int num4=10;
				while (num4<=30) {
					if (num4%2==0) {
						System.out.println(num4);
					}
					num4++;
				}
				System.out.println("--another way--");
				int num5=10;
				while(num5<=30) {
					System.out.println(num5);
					num5+=2;
				}
				  int num8=2;
				    while(num8<=13){
				      System.out.println(num8);
				      num8+=2;
				    }
				
				//print from 100 to 1 only odd numbers
				System.out.println("print from 100 to 1 only odd numbers");
				int num6=99;
				while(num6>0) {
					System.out.println(num6);
					num6-=2;
				}
				
				
				
				
				
				
				
				
	}

}
