package com.syntax.class20;

import com.syntax.class13.SmartPhone;

public class Person {
    String name;
    String address;
    int age;
    String id;
    String phone;
    String SSN;
    char gender;
    char martialStatus;
    double height;
    double weight;
    int numberOfKids;
    double salary;
    String education;

    Person(String name, int age,String phone,double salary  ){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.weight=120;
        this.height=5.4;
        System.out.println("I am the first constructor i only have 4 fields as mandatory");
    }
    Person(String name, int age,String phone,double salary,char martialStatus, int numberOfKids  ){
        this(name, age, phone, salary);
       /* this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;*/
        this.martialStatus=martialStatus;
        this.numberOfKids=numberOfKids;
        System.out.println("I am the first constructor i only have 6 fields as mandatory");
    }
    Person(String name, int age,String phone,double salary,char martialStatus, int numberOfKids, String education  ){
        this(name, age, phone, salary, martialStatus, numberOfKids);
/*
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.martialStatus=martialStatus;
        this.numberOfKids=numberOfKids;*/
        this.education=education;
        System.out.println("I am the first constructor i only have 7 fields as mandatory");
    }
    Person(String name, int age,String phone,double salary,char martialStatus, int numberOfKids, String education, double height,double weight  ){
        this(name, age, phone, salary, martialStatus, numberOfKids, education);
/*        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.martialStatus=martialStatus;
        this.numberOfKids=numberOfKids;
        this.education=education;*/
        this.height=height;
        this.weight=weight;
        System.out.println("I am the first constructor i only have 9 fields as mandatory");
    }

    public static void main(String[] args) {
        Person person1=new Person("Gena", 33, "1234567",0, 'M', 0, "SDET",5.7,168);
        Person person2=new Person("Gena", 33, "1234567",0, 'M', 0, "SDET");


    }


}
