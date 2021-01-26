package com.syntax.class00review.reviewclass21;

import com.syntax.class00review.reviewclass21.LowFundsException;

public class Account {

    double funds;
    Account(double funds){
        this.funds=funds;
    }

    public void withdrawFunds(double fundsToWithdraw) throws LowFundsException {
        if(fundsToWithdraw>funds){
            throw new LowFundsException("The funds in your account are not sufficient");

        }else {
            funds=funds-fundsToWithdraw;
            System.out.println("Successful");
        }
    }
}
