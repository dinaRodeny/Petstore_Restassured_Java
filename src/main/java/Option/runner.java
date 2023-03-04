package Option;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features = "src/main/java/stepdefinition/step/GetAll.feature",
        glue = {"stepdefinition"})

public class runner
{

}
