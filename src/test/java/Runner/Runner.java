package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = "src/test/resources/feature/",
		glue = "Steps",
		tags = "@tag",
		plugin = {"pretty", "html:Test/Advantage.html"},
		monochrome = true,
		dryRun = false
		
		)

public class Runner {

}
