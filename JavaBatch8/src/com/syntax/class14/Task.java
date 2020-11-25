package com.syntax.class14;
import java.util.Scanner;
public class Task {
    public static void main(String[] args) {

       /* Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.
        Only after all requirements met → message “Your username and password has been created”*/

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a username");
        String userName = input.next();
        System.out.println("Enter a password");
        String password = input.next();

        if(userName.isEmpty() && password.isEmpty()){
            System.out.println("Username and Password cannot be empty");
        }else if(password.length()<8){
            System.out.println("Password is too short");
        }else if(password.contains(userName)){
            System.out.println("Password cannot contain username");
        }else if(!password.equals(password)){
            System.out.println("Password do not match");
        }else{
            System.out.println("Your username and password has been created");
        }




    }
}
