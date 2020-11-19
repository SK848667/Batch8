package com.syntax.class15;

public class HW {
    public static void main(String[] args) {
        /*
How would you reverse a String character by character?
How would you reverse a String word by word?
How would you check if String is palindrome or not?
How would you swap  2 strings without a temporary variable?
         */
        System.out.println("-----------------TASK 1------------------------");
// How would you reverse a String character by character?
        StringBuilder str = new StringBuilder("Programming");
        System.out.println(str.reverse().toString());
        System.out.println("-----------------TASK 2----------------------");
// How would you reverse a String word by word?
        String words = new String("You Love Java");
        String[] array = words.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-----------------TASK 3----------------------");
// How would you check if String is palindrome or not?
        String a = new String("Java");
        String b = "";
        for (int j = a.length() - 1; j >= 0; j--) {
            b = b + a.charAt(j);
        }
        if (b.equalsIgnoreCase(a)) {
            System.out.println("String " + a + " is palindrome");
        } else {
            System.out.println("String " + a + " is not palindrome");
        }
        System.out.println("-----------------TASK 4----------------------");
// How would you swap  2 strings without a temporary variable?
        String word1 = new String("Hello");
        String word2 = new String("World");
        word1 = word1 + word2;
        word2 = word1.replaceAll(word2, "");
        word1 = word1.replaceAll(word2, "");
        System.out.println(word1);
        System.out.println(word2);






    }
}
