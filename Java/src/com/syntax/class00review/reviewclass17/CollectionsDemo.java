package com.syntax.class00review.reviewclass17;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionsDemo {
    public static void main(String[] args) {
        /*
    Can store one value at a time
     */
        String name = "Mahmut";
        String name1 = "Danilo";
    /*
    Arrays can store multiple objects

     */
        String[] names = new String[5];
        names[0] = "Mahmut";
        names[1] = "Danilo";
        /*
        Collections frame
         */
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("Chistina");
        arrayList.add("Ali");
        System.out.println(arrayList.get(0).length());
        System.out.println(arrayList.get(1).length());

        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Chistina");
        linkedList.add("Ali");
        Deque<String> deque=new LinkedList<>();



    }


}
