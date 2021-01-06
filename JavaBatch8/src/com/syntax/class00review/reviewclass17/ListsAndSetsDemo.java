package com.syntax.class00review.reviewclass17;

import java.util.*;

public class ListsAndSetsDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        LinkedList<String> linkedList = new LinkedList<>();

        HashSet<String> hashSet = new HashSet<>();

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        TreeSet<String> treeSet=new TreeSet<>();

        arrayList.add("banana");
        arrayList.add("Apple");
        arrayList.add("Apple");
        arrayList.add("orange");
        arrayList.add(0, "Kiwi");
        //  arrayList.addFirst("Kiwi"); not present in list


        linkedList.add("banana");
        linkedList.add("Apple");
        linkedList.add("Apple");
        linkedList.add("orange");
        linkedList.addFirst("Kiwi");

        hashSet.add("banana");
        hashSet.add("Apple");
        hashSet.add("Apple");
        hashSet.add("orange");
        //  hashSet.add(0,"Kiwi"); Not resent in the Set or collection interface

        linkedHashSet.add("banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Apple");
        linkedHashSet.add("orange");


        treeSet.add("banana");
        treeSet.add("Apple");
        treeSet.add("Apple");
        treeSet.add("orange");

        System.out.println("ArrayList");
        System.out.println(arrayList);

        System.out.println("LinkedList");
        System.out.println(linkedList);

        System.out.println("Hashset");
        System.out.println(hashSet);

        System.out.println("linkedHashSet");
        System.out.println(linkedHashSet);

        System.out.println("treeSet");
        System.out.println(treeSet);
    }


}
