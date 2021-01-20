package com.hrms.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                    features = "src/test/resources/features/",//need to give a path for out features file
                    glue = "com/hrms/stepdefinitions",//we need tu glue out step definition-implementation
                    dryRun = false, //!!!!!!!!!!!!!!//when set as true,will run over the feature steps a reveal unimplemented
        // (features file yellow highlighted) dry run looks ahead  --finds unimplemented--->does not run at all
                    tags = "@dashboardTabs", //adding tag ,for multiple use: tags= {"smoke","@whatever"}
                    plugin = {"pretty", // print executed steps inside of your console
                            "html:target/cucumber-default-reports.html", //inside of target folder add cucumber-default-reports folder, // generate default html report
                            "rerun:target/FailedTests.txt", //generate a txt file with failed tests only
                            "json:target/cucumber.json" //generate json report, // (JSON is short for JavaScript Object Notation, and is a way to store information in an organized, easy-to-access manner)
                            }
                )
public class TestRunner {
}
