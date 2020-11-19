package com.syntax.class11;

public class AccessingAllValueFrom2dArray {

	public static void main(String[] args) {
		char[][] $array = new char[3][4];//3 rows, 4 columns
				// first row
				$array[0][0] = 'A';
				$array[0][1] = 'B';
				$array[0][2] = 'C';
				$array[0][3] = 'D';
				// second row
				$array[1][0] = 'W';
				$array[1][1] = 'X';
				$array[1][2] = 'Y';
				$array[1][3] = 'Z';
				// third row
				$array[2][0] = 'Q';
				$array[2][1] = 'W';
				$array[2][2] = 'B';
				$array[2][3] = 'R';

//				System.out.println($array.length);
		
		for (int row=0; row<$array.length; row++) {//loops though rows
			
		
			for (int col=0; col<$array[row].length; col++) {//loops though columns

				System.out.print($array[row][col]+" ");
		}
			System.out.println();
		}
		System.out.println("*******************************************");
		
		int[][] array = { { 1, 2, 3 }, { 10, 20, 30 }, { 100, 200, 300 } };
		
		for (int r=0; r<array.length; r++) {//loops though rows
			for (int c=0; c<array[r].length; c++) {//loops though columns
				System.out.print(array[r][c]+" ");
		}
			System.out.println();
		}

		
		
		
		
	}

}
