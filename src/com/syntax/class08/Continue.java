package com.syntax.class08;

public class Continue {

	public static void main(String[] args) {
		//i want to print numbers from 1 to 5 except number 3
		for (int i = 1; i <= 5; i++) {
			  if (i == 3) {
			    continue;
			  }
			  System.out.println(i);
		}
		System.out.println("end of the loop");
		
		//i want to print numbers from 1 to 10 except number 3 an 7
				for (int i = 1; i <= 10; i++) {
					  if (i == 3 || i==7) {
					    continue;
					  }
					  System.out.print(i+" ");
				}
				
				
				
				
				
	}

}
