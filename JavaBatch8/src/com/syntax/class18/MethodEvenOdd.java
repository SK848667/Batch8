package com.syntax.class18;

public class MethodEvenOdd {
/*
Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
( Return false if one or both given numbers are not even)

Examples:
bothEven(4,6) ==> true
bothEven(3,4) ==> false
bothEven(-1,1) ==> false

Expected Output:
false
 */
        boolean evenOdd(int a, int b){
            if(a%2==0 && b%2==0){
                return true;
            }else if(a%2!=0 || b%2!=0){
                return false;
            }else{
                return false;
            }
        }
        public static void main (String[] args){
            MethodEvenOdd obj=new MethodEvenOdd();
            boolean a= obj.evenOdd(-1,6);
            System.out.println(a);
        }
}
