package com.syntax.HW;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Main {

    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();


        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);

        Set<String> itemNames=map.keySet();

        Iterator<String> iterator =itemNames.iterator();

        while (iterator.hasNext()){
            String key=iterator.next();
            System.out.println("Key = "+key+" and values = "+map.get(key));
        }


    }
}