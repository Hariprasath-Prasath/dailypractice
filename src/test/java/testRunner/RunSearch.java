package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features\\Senario.feature",
		dryRun = !true,
		snippets = SnippetType.CAMELCASE, 
		glue = "stepDefenetion",
		monochrome = true,
		plugin = {"pretty", 
				"html:target/result.html",
				"json:target/result.json",
				"junit:target/result.xml"}
		)

public class RunSearch {

}
