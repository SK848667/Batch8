package com.syntax.class00review.review03;

public class Math {
    public void sum(int a, int b){
        int s=a+b;
        System.out.println("Sum = "+s);
    }


    public int multiply (int a, int b) {
        return a*b;
    }



    public static void main(String[] args) {
        Math math=new Math();
        math.sum(5 , 10);



        int product=math.multiply(3 ,4 );
        System.out.println("Multiply = "+math.multiply(3,4));







    }
}
