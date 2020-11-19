package com.syntax.class13;

public class SmartPhone {
    String brand;
    String color;
    String model;
    void call(int phoneNumber) {
        System.out.println(" Calling " + phoneNumber);
    }
    void dial() {
        System.out.println(brand + " can dial");
    }
    void text(String text) {
        System.out.println(brand + model + " can text " + text);
    }
    void pics() {
        System.out.println(brand + " can take a picture " );
    }


    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.brand = "Samsung";
        phone.color = "Black";
        phone.model = "S 10";
        phone.call(347445328);
        phone.text(" Find a bug ");
        phone.dial();
        phone.pics();
        SmartPhone Iphone = new SmartPhone();
        Iphone.brand = "Iphone";
        Iphone.color = "Black";
        Iphone.model = "12 mini";
        Iphone.call(347445328);
        Iphone.text(" Text me ");
        Iphone.dial();
        Iphone.pics();
    }
}







