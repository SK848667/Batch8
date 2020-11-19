package com.syntax.class13;

public class Main {
    public static void main(String[] args) {
        Dog d1=new Dog();

        d1.age=8;
        d1.name="Hanna";
        d1.breed="Husky";
        d1.color="White";
        d1.gender='F';
        d1.isHealth=true;
        d1.bark();
        d1.sleep();
        d1.jump();


        System.out.println(d1);

    }
}
