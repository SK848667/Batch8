package com.syntax.class17;

public class Main {
    public static void main(String[] args) {


/*
        Variables variables=new Variables();
        Variables var2=new Variables();
        variables.varsDemo();
        variables.varsDemo1();*/


        Student qasim = new Student();
        qasim.name = "Qasim";
        qasim.age = 30;
        qasim.marks = 90;

        qasim.StudentsRegistered();
        qasim.numberOfStudentsEnrolled++;


        Student danilo = new Student();

        danilo.name = "Danilo";
        danilo.age = 30;
        danilo.marks = 95;
        danilo.numberOfStudentsEnrolled++;
        danilo.StudentsRegistered();

        Student ilya = new Student();
        ilya.name = "Ilya";
        ilya.age = 40;
        ilya.marks = 98;
        // ilya.numberOfStudentsEnrolled++;
        ilya.StudentsRegistered();


    }
}
