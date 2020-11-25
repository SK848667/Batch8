package com.syntax.class13;

public class BankApplication {
    public static void main(String[] args) {
       Account burjusAccount=new Account();
       burjusAccount.accountId="123";
        burjusAccount.userName="Burju";
        burjusAccount.password="pass123";
        burjusAccount.balance=1000000;
        burjusAccount.typeOfAccount="checking";
        burjusAccount.limit=125;

        boolean isLoggedIn=burjusAccount
                .login("abc123",
                        "abfjad");

        if(isLoggedIn){
            System.out.println("Welcome to Syntax Bank");
        }else{
            System.out.println("Invalid User Name of Password");
        }

        double amountToTransfer=burjusAccount.amountTransfer(100);
                if(amountToTransfer==0){
                    System.out.println("Insufficient balance");
                }else{
                    System.out.println(amountToTransfer+" Transferred");
                }
        System.out.println(isLoggedIn);

















        Account EliasAccount=new Account();
        EliasAccount.accountId="125";
        EliasAccount.userName="Elias";
        EliasAccount.password="pass123";
        EliasAccount.balance=100;
        EliasAccount.typeOfAccount="saving";
        EliasAccount.limit=10;







    }
}
