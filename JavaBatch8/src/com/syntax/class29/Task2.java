package com.syntax.class29;

abstract class Mark{  //Creating an Abstract class

        abstract double getPercentage();}

class A extends Mark{

    double result;

    A( int val1, int val2, int val3){

        result=(val1+val2+val3)/3;}

    double getPercentage(){

        return result;}}

class B extends Mark{

    double result;

    B(int val1, int val2, int val3, int val4){

        result=(val1+val2+val3+val4)/4;}

    double getPercentage(){

        return result;}}

class Task2{

    public static void main(String args[]){

        //Student A Object

        Mark obj_1=new A(10,20,30);

        System.out.println(obj_1.getPercentage());

        //Student B Object

        Mark obj_2=new B(10,20,38,46);

        System.out.println(obj_2.getPercentage());
    }
}
