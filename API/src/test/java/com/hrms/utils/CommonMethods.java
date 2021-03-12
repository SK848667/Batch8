package com.hrms.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CommonMethods {

    static String jsonFile;
    public static String readJson(String FileName){

        try {
            jsonFile = new String (Files.readAllBytes(Paths.get(FileName)));
        }

        catch (IOException e){
            e.printStackTrace();
        }

        return jsonFile;
    }

}
