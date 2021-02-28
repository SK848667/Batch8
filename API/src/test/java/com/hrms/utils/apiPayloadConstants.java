package com.hrms.utils;

import net.minidev.json.JSONObject;


public class apiPayloadConstants {
    public static String createEmployeeBody() {
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "Steven");
        obj.put("emp_lastname", "Klyman");
        obj.put("emp_middle_name", null);
        obj.put("emp_gender", "M");
        obj.put("emp_birthday", "1988-02-29");
        obj.put("emp_status", "Employee");
        obj.put("emp_job_title", "Manager");

        return obj.toString();
    }
}