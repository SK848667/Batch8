package com.syntax.class19;

import com.syntax.class18.Employee;

public class Employees {
    int age;
    String name;
    char grade;
    Employees(){

        System.out.println("I will be called everytime you create an object of this class");
    }
    /////////////////////////////////////////////////////////////////////////////////////////

    Employees(int ageValue, String nameValue, char gradeValue) {
        System.out.println("I am not useless constractor i am initializing your field");
        if (ageValue > 60 | ageValue < 18) {
            System.out.println("you should not be working plaese retire or wait");
        } else {
            age = ageValue;
        }
        if(nameValue.length()>25){
            System.out.println("Please use short name like Aladin");
        }else{
            name = nameValue;
            grade = gradeValue;
        }
    }

    void print() {
        System.out.println("age " + age + " name " + name + " grade " + grade);
    }



    public static void main(String[] args) {
        Employees employee1 = new Employees();
        employee1.age = 200;
        employee1.grade = 'M';
        employee1.name = "David";
        System.out.println(employee1.age);

        System.out.println("**********************************************");

        Employees employee2 = new Employees(5,"Vlad",'A');
        System.out.println(employee2.age);





        //Constructors
        //Constructors name of the variable
        //=assignment
        //new we want and object
        //Constructors()
    }
}

