package com.syntax.class15;

public class SubString {
    public static void main(String[] args) {
        String name="Hello World";
        System.out.println(name.substring(6));//first 6 characters will be ignored
        System.out.println(name.substring(0));// will show whole text (redundant)
        System.out.println(name.substring(1,10));//can u will be ignored
        System.out.println(name.substring(1,4)+name.substring(6,9));

    }
}
