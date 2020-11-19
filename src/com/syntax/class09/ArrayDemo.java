package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=10;//num0
		
		//num[0]-10 num[1]-20 num[2]-30 num[3]-40  num[4]-50 
		//int 10,20,30,40,50//elements int has 5 values
		
		int [] num=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		//to access elements from an array
		System.out.println("Accessing 3 element "+num[2]);
		//System.out.println(num[1]+num[4]);//arrifmetic
		
		
		//I would like change 50 to 100
		
		num[4]=100;
		System.out.println("Value of 5th element after change "+num[4]);
		
		String[] array=new String[4];
		array[0]="Hello";
		System.out.println(array[0]);

		double[] array2=new double[4];
		array2[0]=10.99;
		System.out.println(array2[0]);

	}

}
