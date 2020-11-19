package com.syntax.class13;

import java.util.Scanner;

public class Garage {
    public static void main(String[] args) {
       // int x=10;
        //Scanner scanner = new Scanner(System.in);
        Car car1=new Car();
        car1.numberOfDoors=4;
        car1.color="black";
        car1.size=4;
        car1.make="BMW";
        car1.model="X7";

        Car car2=new Car();
        car2.numberOfDoors=4;
        car2.color="blue";
        car2.size=2;
        car2.make="lamboghini";
        car2.model="Gallardo";


        System.out.println("Car1. make "+car1.make);
       System.out.println("Car2. make "+car2.make);




    }
}
