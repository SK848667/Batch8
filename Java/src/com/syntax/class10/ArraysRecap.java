package com.syntax.class10;

public class ArraysRecap {

	public static void main(String[] args) {
//5 student in class need to calculate avarage score
		
		int[] grades=new int[5];
		grades[0]=98;
		grades[1]=80;
		grades[2]=89;
		grades[3]=67;
		grades[4]=77;
		
		int avarage=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
		System.out.println("Average store of my students = "+ avarage);
		
		System.out.println("**************************************");
		
		int a=10;
		int b;
		b=10;
		double[] array;
		array=new double[3];
		array[0]=12.99;
		array[1]=10.89;
		System.out.println("value of last element "+ array[2]);
		array[2]=5.99;
		System.out.println("value of last element "+ array[2]);

		System.out.println("**************************************");

		String[] liquid=new String[4];
		liquid[2]="Water";
		liquid[3]="Tea";
		System.out.println(liquid[0]);
		
		
		
		
		
		
	}

}
