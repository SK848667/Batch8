package com.syntax.class16;

public class Task1 {
/*
Create a method that will take 2
parameters as a numbers and prints which number is larger.
 */

    public static void printLarger(double number1, double number2) {

        if(number1>number2){
            System.out.println(number1+ " is larger");
        }else if(number2>number1){
            System.out.println(number2+ " is larger");
        }else {
            System.out.println( "Numbers are equal");
        }
    }

}