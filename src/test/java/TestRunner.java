import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.*;


@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDef", // Package where your step definitions are located

        plugin = {
                "json:target/cucumber.json"
        } // Reporting plugin
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

