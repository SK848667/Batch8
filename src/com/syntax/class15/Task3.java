package com.syntax.class15;

public class Task3 {
    public static void main(String[] args) {
        /*
Create a String that will hold a sentence. Write a program to get a new String without any spaces.

Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String

You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String
         */
        //Task 1
        String first = "This is a first task";
        System.out.println(first.replaceAll(" ", ""));
        System.out.println("******************");
        //task 2
        String second = "This is a second task 12345";
        System.out.println(second.replaceAll("[^0-9]", "").length());
        System.out.println("******************");
        //Task 3
        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] array = a.split(" ");
        for (String a1 : array) {
            System.out.println(a1);
        }

    }
}
