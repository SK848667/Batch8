package com.syntax.class30;

import java.util.ArrayList;

public class Task {

        public static void main(String[] args) {
            ArrayList<String> stringArrayList=new ArrayList<>();

            stringArrayList.add("Danilo");
            stringArrayList.add("Asghar");
            stringArrayList.add("Burju");
            stringArrayList.add("Eduard");
            stringArrayList.add("Daria");

            System.out.println(stringArrayList.isEmpty());
            System.out.println(stringArrayList.contains("Danilo"));
            stringArrayList.remove("Burju");
            System.out.println(stringArrayList.size());
            System.out.println(stringArrayList);

        }

    }

