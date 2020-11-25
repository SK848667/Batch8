package com.syntax.class00review.review03;

import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        String[][][] arr3d = new String[2][2][3];
        //2 floors
        //2 appartments in each floor
        //3 rooms in each appartment
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < arr3d.length; i++) {//
            for (int j = 0; j < arr3d[i].length; j++) {
                for (int k = 0; k < arr3d[i][j].length; k++) {

                    System.out.println("Please enter a name : ");
                    arr3d[i][j][k] = scan.next();
                }

            }

        }
        for (String[][] arr2d : arr3d) {
            for (String[] arr1d : arr2d) {
                for (String value : arr1d) {
                    System.out.print(value+" ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
