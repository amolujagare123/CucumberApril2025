package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        features = "Features",
        glue = "stepdefination",
        tags = "@login"
     // ,  dryRun = true
)
public class TestRunner {
}
