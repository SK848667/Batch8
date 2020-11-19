package com.syntax.class18;

public class MethodINT {
    public void addition  (int a, int b) {
        int s2=a+b;
        System.out.println("Addition "+s2);
    }
    public void multiplication(int a, int b){
        int s=a*b;
        System.out.println("Multiplication "+s);
    }
    public void subtraction (int a, int b) {
        int s3=a-b;
        System.out.println("Subtraction "+s3);
    }



    public static void main(String[] args) {
        MethodINT main2=new MethodINT();
        main2.addition(15, 15);

        MethodINT main=new MethodINT();
        main.multiplication(3, 10);


        MethodINT main3=new MethodINT();
        main3.subtraction(40, 20);
    }

}