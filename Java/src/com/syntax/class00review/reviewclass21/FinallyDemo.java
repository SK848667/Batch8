package com.syntax.class00review.reviewclass21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaBatch8\\src\\com\\syntax\\reviewclass21\\Test.xlsx";
        FileInputStream fileInputStream = null;
        System.out.println(10/0);
        try {
             fileInputStream = new FileInputStream(path);
            System.out.println(10/0);
            System.out.println(" inside the try block");
        } finally {
            System.out.println(" inside finally block");
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" outside the try block");

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
