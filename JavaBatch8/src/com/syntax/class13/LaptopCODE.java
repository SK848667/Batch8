package com.syntax.class13;

import com.syntax.class13.Laptop;

public class LaptopCODE {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.make = "Mac";
        laptop.model = "pro 16";
        laptop.storage = 1;
        laptop.ramCapacity = 16;
        laptop.color = "Pink";
        laptop.processor = "Core i7";
        laptop.GPU = "Nvidia RTX3090 12Gb DDR6x";
        laptop.playMovies();
        laptop.browseInternet();
        laptop.makeVideoCall("Trump");

        String model = laptop.getModel();

        System.out.println(model);

        System.out.println(laptop.upradeRam(2));


    }
}
