package com.syntax.class00review.review03;

public class ArrayRecap {
    public static void main(String[] args) {
        //Array is a container-> size fixed and dta type must be same
        //1 declare and initialize at the same time
        int[] intArr={3,5,7,1,15};
        //2Declare first and than assign value
        int[][] intArr1=new int[2][3];
        intArr1[0][0]=1;
        intArr1[0][1]=2;
        intArr1[0][2]=3;

        intArr1[1][0]=4;
        intArr1[1][1]=5;
        intArr1[1][0]=6;
        //lets find the sum of all values in pur array
        int sum=0;
/*        for (int i = 0; i < intArr1.length; i++) {
            for (int j = 0; j < intArr1.length; j++) {
                sum+=intArr1[i][j];
                System.out.println(sum);
            }
        }
        //System.out.println(sum);*/
for (int[] row:intArr1){
    for (int value:row){
        System.out.println(value+" ");
    }
    System.out.println();
}








    }
}

