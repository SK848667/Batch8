package com.syntax.class21;


import com.syntax.class20.Book;

public class Main {
    String name;
    String lastName;
    int age;
    int salary;
    int grade;
    String seniorActivity;

    void Person(String name,String lastName,int age) {
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
        void Employee(String name, String lastName, int age, int salary) {
            this.salary=salary;
            System.out.println(name+" "+lastName+" "+age+" "+salary);
        }
        void Student(String name, String lastName, int age, int grade) {
            this.grade=grade;
            System.out.println(name+" "+lastName+" "+age+" "+grade);
        }
        void Retiree(String name, String lastName, int age, String seniorActivity) {
           this.seniorActivity=seniorActivity;
            System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
        }
    public static void main(String[] args) {
        Main p1=new Main();
        p1.Employee("Joe","Smith",35, 35000);
        Main p2=new Main();
        p2.Student("Adam","Smith",15,10);
        Main p3=new Main();
        p3.Retiree("Frank","Smith", 15, "tour");
    }
}




