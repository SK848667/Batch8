package com.syntax.class11;

public class task1 {

	public static void main(String[] args) {

		// Create a 2D array where you will store the following values: Mr, Mrs, Ms,
		// Miss and Smith, Jordan, Jackson, Obama.
		// After storing values print the following:
		// Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan
		System.out.println("************************");

		String[][] array = new String[4][4];
		// add values to first row
		array[0][0] = "Mr";
		array[0][1] = "Mrs";
		array[0][2] = "Ms";
		array[0][3] = "Miss";
		// second row
		array[1][0] = "Smith";
		array[1][1] = "Jordan";
		array[1][2] = "Jackson";
		array[1][3] = "Obama";
		System.out.println(array[0][1] + " " + array[1][0] + ", " + array[0][0] + " " + array[1][3] + ", " + array[0][2]
				+ " " + array[1][2] + ", " + array[0][3] + " " + array[1][1]);

		System.out.println("**********task1 teatchers way**********");

		String[][] names = { { "Mr. ", "Mrs. ", "Ms. ", "Miss " }, { "Smith", "Obama", "Jackson", "Jordon" } };

		System.out.println(names[0][1] + names[1][0]);

		System.out.println(names[0][0] + names[1][1]);

		System.out.println(names[0][2] + names[1][2]);

		System.out.println(names[0][3] + names[1][3]);

		System.out.println("***************************tas2 TEATCHERS****************");

		String[][] car = { { "Jeep", "Ford", "Dodge" }, { "Audi", "Porsche", "Bmw" }, { "Kia", "Hyundai", "Genesis" },
				{ "Ferrari", "Maseratti", "Lamborghini" }, };

		for (int i = 0; i < car.length; i++) {
			for (int j = 0; j < car[i].length; j++) {
				String carss = car[i][j];
				System.out.print(carss + "  ");
			}
			System.out.println();
		}

		System.out.println("***********************************");
		for (String[] carArray : car) {
			for (String carArray2 : carArray) {
				System.out.println(carArray2 + " ");
			}
			System.out.println();
		}

	}

}
