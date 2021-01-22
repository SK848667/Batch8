package com.syntax.class15;

import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        String username;
        String password;
        String confirmedPassword;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Username");
        username = scan.nextLine();

        System.out.println("Please Enter Password");
        password = scan.nextLine();




        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password can not be empty");
        } else {
            if (password.length() < 8) {
                System.out.println("Password is too short");
            } else {
                if (password.contains(username)) {
                    System.out.println("Password cannot contain username");
                } else {

                    System.out.println("Please Confirm Password");
                    confirmedPassword = scan.next();

                    if (!password.equals(confirmedPassword)) {
                        System.out.println("Password do not match");
                    } else {
                        System.out.println("Your username and password has been created");
                    }
                }
            }

        }


    }
}
