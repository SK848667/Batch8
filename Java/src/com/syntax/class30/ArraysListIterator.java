package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysListIterator {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(100);
        arrayList.add(200);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println("Qasim");
            iterator.next();

        }


    }
}
