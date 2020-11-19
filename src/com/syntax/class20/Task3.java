package com.syntax.class20;

public class Task3 {
    /*
    Write a program  that will have 4 different access levels of constructors
     and create 3 objects of this class:
     1 - inside same class;
     2 - from outside the class;
     3 - from different class inside different package  and observe result.
     */

    String name;
    int age;
    double salary;

    private Task3(String name) {//Private only in same class //need use    this.
        this.name=name;
    }
    Task3(int age) {//need use    this.
        this.age=age;
    }
    public Task3(double salary) {//need use    this.
        this.salary=salary;
    }

/*    public static void main(String[] args) {
       // Task3 task1=new Task3(); //now Java will not create the default constructor
        Task3 task1=new Task3("Marta");
        System.out.println(task1.name);
        System.out.println(task1.age);
        System.out.println(task1.salary);

        Task3 task2=new Task3(12);
        System.out.println(task2.name);
        System.out.println(task2.age);
        System.out.println(task2.salary);

        Task3 task3=new Task3(100000.00);
        System.out.println(task3.name);
        System.out.println(task3.age);
        System.out.println(task3.salary);

    }*/


}
