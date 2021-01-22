package com.syntax.class18;

public class Task2_reversed {
    public static void main(String[] args) {
        /*
2)Create a method that will take a String as a parameter and returns reversed String.
Method should be available to all classes within your project and accessible by class name.
         */
        String str = "Hello World";
        System.out.println(getReverse(str));
    }
    public static String getReverse(String a){
        String reverse = "";
        char[] charArr = a.toCharArray();
        for(int i = charArr.length - 1; i >= 0 ; i--){
            reverse+=charArr[i];
        }
        return reverse;
    }
}