package googleSearchTestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/googleSearchFeatures"},
		glue = {"googleSearchSteps"}, monochrome=true,
		plugin = {"pretty"})
public class googleSearchTest {

}
