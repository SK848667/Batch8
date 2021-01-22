package com.syntax.class00review.reviewclass17;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class ApplicationsOfSets {
    public static void main(String[] args) {

        // why and when we should be using the sets
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> arrayList=new ArrayList<>();
        TreeSet<String> treeSet=new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            treeSet.add(scanner.next());
        }
        arrayList.addAll(treeSet);
        System.out.println(arrayList);
        String name="asdmfbhsd";

    }
}
