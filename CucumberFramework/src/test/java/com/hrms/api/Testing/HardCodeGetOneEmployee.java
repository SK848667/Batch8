package com.hrms.api.Testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

//given()
//when()
//then()
public class HardCodeGetOneEmployee {
    @Test
    public void sampleTest() {
        RestAssured.baseURI = "http://3.237.189.167/syntaxapi/api";
        String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MTQxMjY0ODgsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYxNDE2OTY4OCwidXNlcklkIjoiMjQ3NiJ9.KJSDbyRPWU6x5ShegV4r5bLjemrnEMMmBbpZyjWH5Wk";
        //preparing request to get one employee
        RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
                .header("Content_Type", "Application/json")
                .queryParam("employee_id", "15436A");
        //sending the request to the endpoint
        Response getOneEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");
        //print the response
        System.out.println(getOneEmployeeResponse.asString());
    }

}
