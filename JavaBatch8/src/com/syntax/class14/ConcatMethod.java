package com.syntax.class14;

import java.util.Scanner;

public class ConcatMethod {
    public static void main(String[] args) {
        String firstName="Ebrar";
        String lastName=" Gur";
        String name=" Burju Kaya";
        String name2=null;
        System.out.println(firstName+lastName+name);
        String completeName=firstName.concat(name);

        System.out.println(completeName);

        String first="S";
        String last=" K";
        String full =first.concat(last);
        System.out.println(full);


        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName2.concat(lastName2));


    }
}
