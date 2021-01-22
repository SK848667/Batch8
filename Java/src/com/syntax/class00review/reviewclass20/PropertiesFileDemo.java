package com.syntax.class00review.reviewclass20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {


    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Asghar Nazir\\IdeaProjects\\Java\\src\\com\\syntax\\reviewclass20\\Test.properties";
        FileInputStream fileInputStream = new FileInputStream(path);

        Properties properties=new Properties();
       // properties.load(fileInputStream); //always load the data before you make changes if you want to retain the data from your file

        System.out.println(properties.getProperty("Username"));
        System.out.println(properties.getProperty("Pass"));
        properties.setProperty("Pass","pas123");
        fileInputStream.close();
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream,"changed the password");
        //Break till 8:20




    }
}
