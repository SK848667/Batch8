package com.syntax.class09;

import java.util.Scanner;

public class PrintPatterns {

	public static void main(String[] args) {

		// ******
		// ******
		// ******
		// ******

		// 4 rows and 6 columns
		for (int row = 1; row <= 4; row++) {// outer loop control COWS
			for (int col = 1; col <= 6; col++) {// inner loop control COLUMNS
				System.out.print("*");
			}
			System.out.println();
		}

//12345678
//12345678
//12345678
//12345678
//12345678
//12345678
//12345678

		System.out.println("*******************************************");
		// 6 rows and 12 columns
		for (int r = 1; r <= 6; r++) {// 6 rows
			for (int c = 1; c <= 12; c++) {// 12 columns
				System.out.print("$");
			}
			System.out.println();
		}
		
		System.out.println("*******************************************");
		for (int r = 1; r <= 7; r++) {
			for (int c = 1; c <= 8; c++) {
				System.out.print(c);
			}
			System.out.println();
		}

		// 555555
		// 444444
		// 333333
		// 222222
		// 111111

		System.out.println("*******************************************");
		for (int r = 5; r >= 1; r--) {
			for (int c = 6; c >= 1; c--) {
				System.out.print(r);
			}
			System.out.println();
		}
		System.out.println("*******************************************");
		for (int r = 5; r >= 1; r--) {
			for (int c = 7; c >= 1; c--) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("*******************************************");
//		1
//		12
//		123
//		1234
		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}

		System.out.println("*******************************************");
		// 1234567
		// 234567
		// 34567
		// 4567
		// 567
		// 67
		// 7
		for (int r = 1; r <= 7; r++) {
			for (int c = r; c <= 7; c++) {
				System.out.print(c);
			}
			System.out.println();
		}

		System.out.println("*******************************************");
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		for (int r = 7; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}

		System.out.println("*******************************************");
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		// 1 2 3 4 5 6
		// 1 2 3 4 5 6 7
		for (int r = 7; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}

		for (int r = 2; r <= 7; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("*******************************************");
		//$$$$
		//$  $
		//$  $
		//$$$$
		
		for (int i=1; i<=4; i++)
        {
            for (int j=1; j<=4; j++)
            {
                if(i ==1 || i == 4   || j == 1 || j == 4 )
                    System.out.print("$");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
		
	}

}
