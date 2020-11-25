package com.syntax.class12;

import java.util.Arrays;

public class Q5 {

    public static void main(String[] args) {

        /*// Write a java program to find the second largest number in the array?

       int[] num1 = {  1964, 45, 965, 65, 965, 32, 876, 900, 900};
        int length = num1.length;
        Arrays.sort(num1);// {1,3,5,6,10}
        System.out.println("Second highest number is " + num1[length - 2]);*/

        // Write a java program to find the second largest number in the array without
        // using sort function

        int[] myArray = { 1964, 45, 965, 65, 965, 32, 876, 900 };
        int largest = myArray[0];
        int secoundlargest = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > largest) {
                secoundlargest = largest;
                largest = myArray[i];

            } else if (myArray[i] > secoundlargest && myArray[i]!=largest) {
                secoundlargest = myArray[i];

            }

        }

        System.out.println("the largest number in array is :" + largest);
        System.out.println("the 2nd largest number is :" + secoundlargest);

    }
}