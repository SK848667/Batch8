package com.syntax.class16;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String givenString = inp.nextLine();
        //write your code below

         /*String rev = "";
      int length = givenString.length();
      for ( int i = length - 1; i >= 0; i-- ){
         rev = rev + givenString.charAt(i);}
      if (givenString.equals(rev)){
         System.out.println("true");

      }else if(givenString.equalsIgnoreCase ("never odd or even")){
            System.out.println("true");
      }else if(givenString.equalsIgnoreCase ("a Toyotas a Toyota")){
            System.out.println("true");
      }else if(givenString.equalsIgnoreCase ("Was it a car or a cat I saw")){
            System.out.println("true");
      }else if(givenString.equalsIgnoreCase ("oozy RAT in a sanitary ZOO")){
            System.out.println("true");


      }else{
         System.out.println("false");

         }

    }
}*/
        givenString=givenString.replaceAll(" ","");
        String reverse="";
        for(int i=givenString.length()-1;i>=0; i--){
            reverse=reverse+givenString.charAt(i);

        }
        if(givenString.equalsIgnoreCase(reverse)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

}
