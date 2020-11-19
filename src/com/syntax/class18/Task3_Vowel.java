package com.syntax.class18;

public class Task3_Vowel {
    public static void main(String[] args) {
        /*
3)Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name.
         */
        String str = "Hello World";
        System.out.println(getVowels(str));
    }
    private static String getVowels(String a){
        String vowels = "AaEeIiOoUu";
        String vowelsInString = "";
        char[] charArr = vowels.toCharArray();
        for(int i = 0; i < a.length(); i++){
            for(int j = 0; j < charArr.length; j++){
                if(a.charAt(i)==(charArr[j])){
                    vowelsInString+=charArr[j];
                }
            }
        }
        return vowelsInString;
    }
}