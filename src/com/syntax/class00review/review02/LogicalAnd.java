package com.syntax.class00review.review02;

public class LogicalAnd {

	public static void main(String[] args) {
		int num = 0;
		if (num >= 0) {
			if (num <= 100) {
				System.out.println("number between 0 and 100");
			} else {
				System.out.println("number NOT between 0 and 100");

			}
		} else {
			System.out.println("number NOT between 0 and 100");

		}
		
		if (num >=0 && num <=100)
		{
			System.out.println("number between 0 and 100");
		}
	}

}
