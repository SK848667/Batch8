package com.syntax.class00review.reviewclass16;

public interface Driveable {
    boolean FAST_DRIVE=true;
    void drive();
    default void printInfo(){
        System.out.println("My Name is Danilo");
    }
    static  void printName(){
        System.out.println("My Name is Qasim");
    }
}


class  Car implements Driveable{

    @Override
    public void drive() {
        System.out.println("Now we can drive a car");
    }

}

class Bike implements Driveable{

    @Override
    public void drive() {
        System.out.println(" Now i can ride a bike");
    }
}

