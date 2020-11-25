package com.syntax.class13;

public class Laptop {
    String make;
    String model;
    int storage;
    int ramCapacity;
    String color;
    String processor;
    String GPU;

    void playMovies(){
        System.out.println("Play movies");
    }
    void browseInternet(){
        System.out.println("Browse the internet");
    }
    void makeVideoCall(String contact){
        System.out.println("Video calling to "+contact);
    }

    public String getModel() {
        return model;
    }
        int upradeRam(int newRamUnit){
            return newRamUnit*ramCapacity;
    }





}
