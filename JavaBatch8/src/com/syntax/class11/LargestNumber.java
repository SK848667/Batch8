package com.syntax.class11;

public class LargestNumber {

	public static void main(String[] args) {
		// I would like to find largest number from the array?//largest number compared to array elements
		
		int[] array= {10, 0, 20, 8, -100, 77, 56};
		int max = array[0];//first largest in array
		
		for(int i = 1; i < array.length;i++){
			if(array[i] > max){
				max = array[i];
			}
		}
	//	for(int i = 0; i < array.length;i++){
	//		System.out.println(array[i]);
	//	}
		
		System.out.println("Largest Number is:" + max);
		

		
		
		
	}

}
