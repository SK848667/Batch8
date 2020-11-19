package com.syntax.class17;

public class RecapHW1 {


        /*
    Create a method createEmail(). Based on values of users name,
     lastName and email type, your method should return complete email Address.
      Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */

    String createEmail(String firstName, String lastName, String emailType) {
        return firstName + lastName + "@" + emailType + ".com";
    }





    public static void main(String[] args) {
        RecapHW1 task1=new RecapHW1();
        String email = task1.createEmail("Ahmed", "Qasim", "Gmail");
        System.out.println(email);
        }

}
