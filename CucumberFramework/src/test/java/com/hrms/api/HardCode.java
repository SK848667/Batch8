package com.hrms.api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

//given()
//when()
//then()
public class HardCode {
    String BaseURI = RestAssured.baseURI = "http://3.237.189.167/syntaxapi/api";
    String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MTY2MDc3NjEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYxNjY1MDk2MSwidXNlcklkIjoiMjQ3NiJ9.8BdL4bEtq7-tixYkcmhtSEV_LdZp4vdj30rE4kyItGc";
    static String employeeID;

    public void sampleTest() {
        RequestSpecification preparingGetOneEmployeeRequest= given().header("Authorization",token).header("Content-Type","Application/json").queryParam("employee_id","18301A");
        Response getOneEmployeeResponse=preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");
        System.out.println(getOneEmployeeResponse.asString());
    }




    @Test
    public void GetOneEmployee() {
        //RestAssured.baseURI = "http://3.237.189.167/syntaxapi/api";
        //String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MTQxMjY0ODgsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYxNDE2OTY4OCwidXNlcklkIjoiMjQ3NiJ9.KJSDbyRPWU6x5ShegV4r5bLjemrnEMMmBbpZyjWH5Wk";

        //preparing request to get one employee
        RequestSpecification GetOneEmployeeRequest = given().header("Authorization", token)
                .header("Content_Type", "Application/json")
                .queryParam("employee_id", "18301A");
        //sending the request to the endpoint
        Response getOneEmployeeResponse = GetOneEmployeeRequest.when().get("/getOneEmployee.php");
        //print the response
        //System.out.println(getOneEmployeeResponse.asString());
        getOneEmployeeResponse.prettyPrint();

        //Assert that status is 200
        getOneEmployeeResponse.then().assertThat().statusCode(200);
    }

    @Test
    public void CreateEmployee() {
        //Preparing Create an Employee Request
        RequestSpecification createEmployeeRequest = given().header("Authorization", token)
                .header("Content_Type", "Application/json")
                .body("{\n" +
                        "  \"emp_firstname\": \"Steven\",\n" +
                        "  \"emp_lastname\": \"Klyman\",\n" +
                        "  \"emp_middle_name\": null,\n" +
                        "  \"emp_gender\": \"M\",\n" +
                        "  \"emp_birthday\": \"2021-02-11\",\n" +
                        "  \"emp_status\": \"employee\",\n" +
                        "  \"emp_job_title\": \"IT Analyst\"\n" +
                        "}");
        //Makinga Post call to create employee
        Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");
        //Printing EmployeeID
        createEmployeeResponse.prettyPrint();
        //Assert that status code is 201
        createEmployeeResponse.then().assertThat().statusCode(201);
        //Get Employee_id
        String employeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");
        //Print EmployeeID
        //System.out.println(employeeID);
        //Assert that message contains Entry Created
        createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));
        //Assert that Employee ID is 15863A//id will be new every time SO will compare by emp_firstname
        createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("Steven"));
        createEmployeeResponse.then().header("Server","Apache/2.4.39 (Win64) PHP/7.2.18");

    }

    @Test
    public void GetCreatedEmployee() {
        RequestSpecification getCreatedEmployeeRequest = given().header("Authorization", token)
                .header("Content_Type", "Application/json")
                .queryParam("employee_id", "18304A");
        Response getCreatedEmployeeResponse = getCreatedEmployeeRequest.when().get("/getOneEmployee.php");
        //getCreatedEmployeeResponse.prettyPrint();
        String empID = getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");

        //we are checking if the empID is equal to the one mentioned in string
        boolean VerifyEmployeeID = empID.equalsIgnoreCase("18304A");
        System.out.println(VerifyEmployeeID);
        Assert.assertTrue((VerifyEmployeeID));
        getCreatedEmployeeResponse.then().assertThat().statusCode(200);

        String response=getCreatedEmployeeResponse.asString();
        JsonPath js=new JsonPath(response);

        String firstName=js.getString("employee[0].emp_firstname");

        Assert.assertEquals(firstName,"Steven");
        //same assert but different way
        //getCreatedEmployeeResponse.then().assertThat().body("employee[0].employee_id", equalTo("15436A"));
    }

    @Test
    public void UpdateEmployee() {
        RequestSpecification updateEmployeeRequest = given().header("Authorization", token)
                .header("Content_Type", "Application/json")
                .body("{\n" +
                        "  \"employee_id\": \"18304A\",\n" +
                        "  \"emp_firstname\": \"Steven\",\n" +
                        "  \"emp_lastname\": \"Klyman\",\n" +
                        "  \"emp_middle_name\": null,\n" +
                        "  \"emp_gender\": \"M\",\n" +
                        "  \"emp_birthday\": \"2021-02-11\",\n" +
                        "  \"emp_status\": \"employee\",\n" +
                        "  \"emp_job_title\": \"IT Analyst\"\n" +
                        "}");

        Response UpdateEmployeeResponse = updateEmployeeRequest.when().put("/updateEmployee.php");
        UpdateEmployeeResponse.prettyPrint();

        //assert that updated information is correct
        JsonPath js = UpdateEmployeeResponse.jsonPath();
        String employee_firstname = js.getString("employee[0].emp_firstname");
        System.out.println(employee_firstname);
        assertThat(employee_firstname, equalTo("Steven"));
        //in other way
        UpdateEmployeeResponse.then().assertThat().body("employee[0].emp_firstname", equalTo("Steven"));
        //in another way
        //create boolean and use Assert.assertTrue(employee_firstname);
    }

    @Test
    public void PartialUpdatedEmployee() {
        RequestSpecification partialUpdatedEmployeeRequest = given().header("Authorization", token)
                .header("Content-Type", "Application/json").body("{\n" +
                        "  \"employee_id\": \"18304A\",\n" +
                        "  \"emp_firstname\": \"Steveeee\"\n" +
                        "}");
        Response PartialUpdatedEmployeeResponse = partialUpdatedEmployeeRequest.when()
                .patch("/updatePartialEmplyeesDetails.php");
        PartialUpdatedEmployeeResponse.prettyPrint();

        //assert that body contains the Message entered updated
        JsonPath js = PartialUpdatedEmployeeResponse.jsonPath();
        Object Message = js.get("Message");
        System.out.println(Message);
        assertThat(Message, equalTo("Entry updated"));
        //other way
        PartialUpdatedEmployeeResponse.then().body("Message", containsString("Entry updated"));
    }

    @Test
    public void DeleteEmployeeRequest() {
        RequestSpecification deleteEmployeeRequest = given().header("Authorization", token)
                .header("Content-Type", "Application/json")
                .queryParam("employee_id", "18304A");
        Response DeleteEmployeeResponse = deleteEmployeeRequest.when().delete("/deleteEmployee.php");
    DeleteEmployeeResponse.prettyPrint();

    //assert that message contains entry deletd message "Entry deleted"
        DeleteEmployeeResponse.then().assertThat().
                body("message", containsString("Entry deleted"));
    }

    @Test
    public void getJobTitle() {
        RequestSpecification request = given().header("Authorization", token)
                .header("Content-Type", "Application/json");

        Response response = request.when().get("/jobTitle.php");
        response.prettyPrint();
    }

    @Test
    public void GETallEmployees() {
        RequestSpecification getAllEmployeesRequest = given().header("Content-Type","application/json").header("Authorization",token);

        Response getAllEmployeesResponse = getAllEmployeesRequest.when().get("/getAllEmployees.php");

        getAllEmployeesResponse.prettyPrint();

        String response = getAllEmployeesResponse.asString();
        JsonPath js =new JsonPath(response);
        int count =js.getInt("Employees.size()");
        System.out.println(count);

        //printing out all employee ids
        for(int i=0; i<count ;i++) {
            String allEmployeeIDs=js.getString("Employees["+i+"].employee_id");
            if (allEmployeeIDs.contentEquals(employeeID)) {
                System.out.println("Employee ID:"+employeeID+"is present in the body");
                String FirstNameOfEmpID=js.getString("Employees["+i+"].emp_firstname");
                System.out.println(FirstNameOfEmpID);
                break;
            }
        }
    }


    @Test
    public void PUTupdateCreatedEmployee() {

        given().body("{\r\n"
                + "    \"employee_id\":\"employeeID\" ,\r\n"
                + "  \"emp_firstname\": \"Moazzam\",\r\n"
                + "  \"emp_lastname\": \"updated\",\r\n"
                + "  \"emp_middle_name\": \"Sadiq\",\r\n"
                + "  \"emp_gender\": \"M\",\r\n"
                + "  \"emp_birthday\": \"2021-01-13\",\r\n"
                + "    \"emp_job_title\":\"Cloud Architect\",\r\n"
                + " \"emp_status\": \"Employee\"\r\n"
                + "}");



    }
}

