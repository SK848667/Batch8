package com.syntax.class14;

public class LengthMethod {
    public static void main(String[] args) {
        String name="qasim";
        System.out.println(name.length());
        name="";
        System.out.println(name.length());
        name="Ahmed Qasim";
        System.out.println(name.length());
        name=" Qasim ";
        System.out.println(name.length());

        if (name.length()>10) {
            System.out.println("YOU ARE GREAT");
        }


    }
}
