
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/features/Feature.feature",
        glue = {"StepDefinition.java"},
        monochrome = true
        , plugin = {"pretty",
        "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports/html"}
)
public class TestRunner {


}
