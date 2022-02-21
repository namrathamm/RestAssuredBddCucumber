package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/Allfeatures",
glue="allstepDefinitions",
tags = "@tag, @smoke",
monochrome = true,
dryRun =true)

public class testRunner {

}
