package com.syntax.class15;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
//        Write a program that reads two people's first
//        names and if they expecting boy or girl?
//        Based on the input suggests a name for a baby:
//        Example Output:
//        Mom’s first name? Mary
//        Dad’s first name? Daniel
//        Boy or Girl? boy
//        Suggested baby name: DANRY
//        Example Output:
//        Mom’s first name? Mary
//        Dad’s first name? Daniel
//        Boy or Girl? girl
//        Suggested baby name: MAIEL

        /*Scanner scan = new Scanner(System.in);
        System.out.println("What is mom's name?");
        String mom = scan.nextLine();
        System.out.println("What is dad's name");
        String dad = scan.nextLine();
        System.out.println("Boy of girl?");
        String baby = scan.nextLine();
        if (baby.equalsIgnoreCase("girl")) {
            System.out.println("Suggested baby name: " + mom.substring(0, 2) + dad.substring(dad.length() - 3, dad.length()));
        }
        if (baby.equalsIgnoreCase("boy")) {
            System.out.println("Suggested baby name: " + dad.substring(0, 3) + mom.substring(mom.length() - 2, mom.length()));
        }*/

        Scanner scan = new Scanner(System.in);
        String momsName, dadsName, gender, babysName;

        System.out.println("Please enter moms name");
        momsName = scan.nextLine();

        System.out.println("Please enter dads name");
        dadsName = scan.nextLine();

        System.out.println("Boy of girl?");
        gender = scan.nextLine();

        if (gender.toLowerCase().startsWith("b")) {
            String firstPart = dadsName.substring(0, dadsName.length() / 2);
            String secondPart = momsName.substring(momsName.length() / 2);
            babysName = firstPart + secondPart;
        }else if (gender.toLowerCase().startsWith("g")){
            String firstPart = momsName.substring(0, momsName.length() / 2);
            String secondPart = dadsName.substring(dadsName.length() / 2);
            babysName = firstPart + secondPart;
        } else{
            babysName="No suggestions";
        }
        System.out.println(babysName);
    }
}
