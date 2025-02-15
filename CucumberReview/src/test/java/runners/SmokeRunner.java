package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/"
        , glue = "stepdefinitions"
        //, tags = "@search"
        , dryRun = true
        , plugin ={
                "pretty"
        }

)
public class SmokeRunner {

}
