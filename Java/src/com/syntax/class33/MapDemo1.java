package com.syntax.class33;

import java.util.HashMap;
import java.util.Map;
public class MapDemo1 {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(111,"Jack");
        hashMap.put(111,"Vladimir");
        hashMap.put(111,"Maria");
        hashMap.put(111,"Danis");
        hashMap.put(111,"Daria");
        hashMap.put(111,"Jassor");

        System.out.println(hashMap); //only one value will be stored in the map because we are providing the same key again and again
    }
}
