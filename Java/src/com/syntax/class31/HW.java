package com.syntax.class31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HW {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Brazil");
        hashSet.add("Peru");
        hashSet.add("Mexico");
        hashSet.add("Antarctica");
        hashSet.add("Italy");
        hashSet.add("Brazil");
        hashSet.add("Cuba");
        hashSet.add("Moldova");
        //Task01
        System.out.println("-----task01-----");
        Set<String> sortedSet = new TreeSet<>(hashSet);
        System.out.println(sortedSet);
        //Task02
        System.out.println("-----task02-----");
        Set<String> linkedHashSet = new LinkedHashSet<>(hashSet);
        linkedHashSet.removeIf(city -> city.startsWith("A"));
        System.out.println(linkedHashSet);
        //Task03
        System.out.println("-----task03-----");
        Set<Student> students = new HashSet<>();
        students.add(new Student("Linda","234567L"));
        students.add(new Student("Colin","098732C"));
        students.add(new Student("Elizabeth","33432E"));
        students.stream()
                .map(student -> student.name)
                .forEach(System.out::println);
    }
}
// Task 03
class Student {
    String name;
    String studentID;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

}
