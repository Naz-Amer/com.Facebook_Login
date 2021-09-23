package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/feature/LoginAttempt.feature",
        glue="stepDefinition",
        plugin={"html:target/cucumber-html-report","json:target/cucumber.json"},
        monochrome = true, //display the console output in a proper readable format
        //strict = false,
        //dryRun = false //to check the mapping is proper between feature file and step def file
         tags = {"@test"}
)

public class Runner {
}
