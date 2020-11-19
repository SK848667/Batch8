package com.syntax.class13;

public class Account {

        String accountId;
        String userName;
        String password;
        String typeOfAccount;
        double balance;
        double limit;

        //Write a method that takes the amount
    // that user wats to transfer and return the amount of
    // transfer in case of success or failure
        double amountTransfer(double amountToTransfer) {
            if (amountToTransfer < balance) {
                return amountToTransfer - amountToTransfer;
            } else {
                return 0;
            }
        }


    boolean login(String enteredUserName, String enteredpassword) {
        if (userName.equals(enteredUserName) &&
                password.equals(enteredpassword)) {
            return true;
        } else {
            return false;
        }
    }


}
