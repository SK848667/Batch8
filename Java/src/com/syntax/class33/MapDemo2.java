package com.syntax.class33;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {

    public static void main(String[] args) {
        Map<String,Integer> hasMap=new HashMap<>();
        hasMap.put("Jack"    ,111);
        hasMap.put("Vladimir",222);
        hasMap.put("Maria"   ,333);
        hasMap.put("Danis"   ,444);
        hasMap.put("Daria"   ,555);
        hasMap.put("Jassor"  ,666);
        System.out.println(hasMap);

        Map<String,Integer> linkedHashmap=new LinkedHashMap<>();
        linkedHashmap.put("Jack"    ,111);
        linkedHashmap.put("Vladimir",222 );
        linkedHashmap.put("Maria"   ,333 );
        linkedHashmap.put("Danis"   ,444);
        linkedHashmap.put("Daria"   ,555);
        linkedHashmap.put("Jassor"  ,666);


        System.out.println(linkedHashmap);


        Map<String,Integer> treMap=new TreeMap<>();
        treMap.put("Jack"    ,111);
        treMap.put("Vladimir",222 );
        treMap.put("Maria"   ,333 );
        treMap.put("Danis"   ,444);
        treMap.put("Daria"   ,555);
        treMap.put("Jassor"  ,666);
        treMap.put("V"  ,666);
        System.out.println(treMap);

        Map<Integer ,String> treMap2=new TreeMap<>();
        treMap2.put(222   ,"Jack" );
        treMap2.put(555   ,"Vladimir");
        treMap2.put(444   ,"Maria");
        treMap2.put(111   ,"Danis");
        treMap2.put(333   ,"Jassor");

        System.out.println(treMap2);
    }
}
