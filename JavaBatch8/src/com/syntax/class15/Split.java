package com.syntax.class15;

public class Split {
    public static void main(String[] args) {
        String name="Burju Maria Qasim";
        String [] array=name.split(" ");
        for (String name1:array){
            System.out.println(name1);
        }
        System.out.println("*******************");

        String name2="Burju*maria*Qasim";
        String [] array2=name2.split("[^A-Z a-z]");
        for (String name3:array2){
            System.out.println(name3);
        }










    }
}
