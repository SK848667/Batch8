package com.syntax.class16;
import java.util.Scanner;
//Write a method to return whether given number is prime or not?
public class HW2 {
    public static boolean PrimeOrNot (int num1) {
        if (num1>1) {
            for (int i = 2; i<num1; i++) {
                if (num1%i!=0) {
                    return true;
                }else {
                    return false;
                }
            }
        } else{
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num1=inpu.nextInt();
        if (PrimeOrNot(num1)) {
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
