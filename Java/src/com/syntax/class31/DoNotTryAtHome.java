package com.syntax.class31;

import java.util.ArrayList;
import java.util.LinkedList;

public class DoNotTryAtHome {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        LinkedList<Integer> linkedList=new LinkedList<>();
        System.out.println("started ");
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("adding the element at the start of ArrayList");
        arrayList.add(0,100);
        System.out.println("adding the element at the start of LinkedList");
        linkedList.addFirst(1000);
        System.out.println("Done");

    }
}
