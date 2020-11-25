package com.syntax.class16;

import java.util.Scanner;
/*
Create a method createEmail(). Based on values of users name, lastName and email type,
your method should return complete email Address.
Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
 */
public class HW1 {
    private static String createEmail(String userName, String lastName, String emailType) {
        String completeEmail = userName.toLowerCase() +
                lastName.toLowerCase() + "@" + emailType.toLowerCase() + ".com";
        return completeEmail;
    }

    public static void main(String[] args) {
        String userName, lastName, emailType, completeEmail;
        System.out.println("Enter your name:");

        Scanner input = new Scanner(System.in);
        userName = input.nextLine();
        System.out.println("Enter your last name:");
        lastName = input.nextLine();
        System.out.println("Enter your email type:");
        emailType = input.nextLine();
        completeEmail = createEmail(userName, lastName, emailType);
        System.out.println(completeEmail);
    }
}