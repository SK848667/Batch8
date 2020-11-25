package com.syntax.class00review.review01;

public class ForLoops {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.println("outer lopp");
			for (int j = 0; j < 2; j++) {
				System.out.println("inner loop");
				for (int k = 0; k < 1; k++) {
					System.out.println("2ns inner loop");

				}
			}
		}
	}

}
