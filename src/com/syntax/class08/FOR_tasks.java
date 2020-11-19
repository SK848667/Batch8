package com.syntax.class08;

import java.util.Scanner;

public class FOR_tasks {

	public static void main(String[] args) {
		// Print numbers from 1 to 100 in 1 line with space
		// Print numbers from 100 to 1
		// Print even numbers from 20 to 1 (2 ways)
		// Print odd numbers between 20 and 50 (2 ways)
		System.out.println("Print numbers from 1 to 100 in 1 line with space");
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("Print numbers from 100 to 1");
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Print even numbers from 20 to 1 ");
		for (int i = 20; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("even numbers Second way ");
		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("Print odd numbers between 20 and 50 ");
		for (int a=20; a<=50; a++) {
			if(a%2!=0) {
				System.out.print(a+" ");
			}
		}

		System.out.println();
		System.out.println("odd numbers Second way ");
		for (int i = 21; i <= 50; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("*****************test**********************");

		int sum=0;
		for(int i=1; i<6; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		System.out.println("-----------------------------------------");
		
		int a;
		for(a=1; a<6; a++) {
			System.out.println("Value for a inside the loop"+a);
		}
		System.out.println("Value for a outside the loop"+a);

		System.out.println();
		System.out.println("**********test2*********numbers from 100 to 1*************");
		int result=1;
		for(int i=10; i>=1; i-=2){
			result*=i;
			System.out.println("result ="+result);
		}
		//System.out.println(result);
		System.out.println();
		System.out.println("******test3********odd numbers from 1 to 50**************");
		//calculate sum of even and odd numbers from 1 to 50
		int sumx=0;
		int sumy=0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
			sumx+=i;
			}else {
				sumy+=i;
			}
		}
			System.out.println(sumx);
			System.out.println(sumy);
		
			System.out.println();
			System.out.println("*****************test4******multiplication table*******************");
			//I ant to create a multiplication table
			/*
			 * 1x1=1
			 * 1x2=2
			 * 1x3=3 'till to 10
			 */
		int num1=1;
		int mult;
		for(int i=1; i<=10; i++) {
			mult=num1*i;
			System.out.println(num1+" x "+i+" = "+mult);
		}
		
		System.out.println("*****************");
		
		System.out.println("same with scanner");
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number to multiply:");
		int num2=scan.nextInt();
		int mult2;
		for(int i=1; i<=10; i++) {
			mult2=num2*i;
			System.out.println(num2+" x "+i+" = "+mult2);
		}
		
		
		
	}

}
