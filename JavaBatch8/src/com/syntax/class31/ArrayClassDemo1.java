package com.syntax.class31;

import java.util.ArrayList;

public class ArrayClassDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(17.99);
        doubleArrayList.add(16.99);
        System.out.println("Before replacement");
        System.out.println(doubleArrayList);
        System.out.println("*********************************");
        doubleArrayList.set(2, 20.25);
        System.out.println("After replacement");
        System.out.println(doubleArrayList);
        System.out.println("*********************************");
        doubleArrayList.remove(0);
        System.out.println("After removel");
        System.out.println(doubleArrayList);
        System.out.println("*********************************");
        System.out.println("Printing from top to bottom");
        for (Double singleNum : doubleArrayList) {
            System.out.println(singleNum);
        }
        System.out.println("*********************************");
        System.out.println("Looping in reverse order");
        for (int i = doubleArrayList.size()-1; i>=0 ; i--) {
            System.out.println(doubleArrayList.get(i));
        }
        System.out.println("*********************************");



    }
}
