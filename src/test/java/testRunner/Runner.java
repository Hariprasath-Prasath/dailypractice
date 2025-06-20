package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features\\login.feature",
		dryRun = !true,
		snippets = SnippetType.CAMELCASE,
		glue = "stepDefenetion", 
		monochrome = true
		)

public class Runner {

}