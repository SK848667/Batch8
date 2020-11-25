package com.syntax.class00review.review03;

import java.sql.SQLOutput;

public class School {
    //instance variables


    //instance variables are created inside classes but outside of any method
    //states/attributes of our objects
    //vallue are different for each object of the classes
    String name, lastName;//instance
    int age;

    //static variables
    //value is same for all object
    //we do not need to create an object to accept static
    //can be accessible by using ClassName
    static String schoolName;

    //local variables-> local inside where it is created
    //they are created inside a method or a block of code
    //Access modifiers->public, protected, default, private

    //can we use acess mofifiers
        //with local variables-->NO
        //instance variables-->YES
        //static variables-->YES
    //what kind of methods we have--> 1. Built-in Methods
                                    //2. User Defined Methods
    public void printDetails(){
        System.out.println("Name and LastName : "+ name+" "+lastName);
        System.out.println("Age : "+age);
    }
    public  void study(int hours){
        System.out.println(name+" "+lastName+" studies "+hours+" hours a ");
    }

    public static void goToSchool(String[] args) {
        System.out.println("Student go to school");
    }




    public static void main(String[] args) {

        //instance variables
        School stud1=new School();
        stud1.name="John";
        stud1.lastName="Terry";
        stud1.age=12;

        School stud2=new School();
        stud2.name="James";
        stud2.lastName="Miller";
        stud2.age=9;

        System.out.println(stud1.name);
        System.out.println(stud2.name);


        //static variable
        School.schoolName="Harvard University";

        School stud3=new School();
        stud3.name="James";
        stud3.lastName="Miller";
        stud3.age=9;
        System.out.println(stud3.schoolName);

//public
        //private
        //protected
        //default



    }
}
