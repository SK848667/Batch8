package com.syntax.class00review.reviewclass16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Eduard");
        list.add("Burju");
        list.add("Qasim");
        list.add("Moneer");

        for (String name:list
             ) {
            if(name.startsWith("A")){
                System.out.println(name);
            }
        }

        list.stream().filter(f -> f.startsWith("A")).forEach(System.out::println);
    }
}
