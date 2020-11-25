package com.syntax.class19;

public class Constructors {

    /*static*/ int number;
    /*static*/ String name;
    /*static*/ char character;

    Constructors(){

        System.out.println("I will be called everytime you create an object of this class");
    }

    Constructors(int numberValue, String nameValue,char characterValue) {
        System.out.println("I am not useless constractor i am initializing your field");
        number = numberValue;
        name = nameValue;
        character = characterValue;
    }


    /*static*/ void print() {
        System.out.println("Number " + number + " name " + name + " character " + character);
    }


    public static void main(String[] args) {
        Constructors constructors = new Constructors();
        Constructors constructors2 = new Constructors(100,"Vlad",'A');

         constructors2.print();

        //Constructors
        //Constructors name of the variable
        //=assignment
        //new we want and object
        //Constructors()


        //int num;
       // System.out.println(num);
    }
}
