package com.syntax.class15;

public class Append_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Hello");
        stringBuilder.append(" world");
        System.out.println(stringBuilder);

       /* String string="Hello";
        string.concat("World");
        System.out.println(string);*/
        System.out.println("****************************************");

        StringBuilder strB = new StringBuilder("study");
        strB.append("tonight");
        System.out.println(strB);    // Output: studytonight
    }
}
