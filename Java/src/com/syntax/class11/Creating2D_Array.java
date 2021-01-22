package com.syntax.class11;

public class Creating2D_Array {

	public static void main(String[] args) {
		// create 2d(2 dimensions) array of food:
		// american
		// asian
		// afghanian
		// indian

		String[][] food = { { "steak", "hot dog", "cheeseburger" }, { "pizza", "pasta", "canoli" },
				{ "sushi", "ramen", "rice", "dumplongs" }, { "kebab", "manto" },
				{ "beriyani", "masal", "curry", "chicken tikka masala" }, };

		// 1way
		for (String[] dishes : food) {
			for (String dish : dishes) {
				System.out.print(dish + ", ");
			}
			System.out.println();
		}
		System.out.println("********************************************************************");

		// 2 way
		for (int i = 0; i < food.length; i++) {
			for (int j = 0; j < food[i].length; j++) {
				System.out.print(food[i][j] + ", ");
			}
			System.out.println();
		}

	}

}
